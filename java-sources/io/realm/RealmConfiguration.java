package io.realm;

import android.content.Context;
import io.realm.annotations.RealmModule;
import io.realm.coroutines.FlowFactory;
import io.realm.coroutines.RealmFlowFactory;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmCore;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Util;
import io.realm.internal.modules.CompositeMediator;
import io.realm.internal.modules.FilterableMediator;
import io.realm.rx.RealmObservableFactory;
import io.realm.rx.RxObservableFactory;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import p123m2.c;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public class RealmConfiguration {
    private static final Object DEFAULT_MODULE;
    protected static final RealmProxyMediator DEFAULT_MODULE_MEDIATOR;
    public static final String DEFAULT_REALM_NAME = "default.realm";
    private final boolean allowQueriesOnUiThread;
    private final boolean allowWritesOnUiThread;
    private final String assetFilePath;
    private final String canonicalPath;
    private final CompactOnLaunchCallback compactOnLaunch;
    private final boolean deleteRealmIfMigrationNeeded;
    private final OsRealmConfig.Durability durability;
    private final FlowFactory flowFactory;
    private final Realm.Transaction initialDataTransaction;
    private final boolean isRecoveryConfiguration;
    private final byte[] key;
    private final long maxNumberOfActiveVersions;
    private final RealmMigration migration;
    private final boolean readOnly;
    private final File realmDirectory;
    private final String realmFileName;
    private final RxObservableFactory rxObservableFactory;
    private final RealmProxyMediator schemaMediator;
    private final long schemaVersion;

    public static class Builder {
        private boolean allowQueriesOnUiThread;
        private boolean allowWritesOnUiThread;
        private String assetFilePath;
        private CompactOnLaunchCallback compactOnLaunch;
        private HashSet<Class<? extends RealmModel>> debugSchema;
        private boolean deleteRealmIfMigrationNeeded;
        private File directory;
        private OsRealmConfig.Durability durability;
        private boolean excludeDebugSchema;
        private String fileName;
        private FlowFactory flowFactory;
        private Realm.Transaction initialDataTransaction;
        private byte[] key;
        private long maxNumberOfActiveVersions;
        private RealmMigration migration;
        private HashSet<Object> modules;
        private boolean readOnly;
        private RxObservableFactory rxFactory;
        private long schemaVersion;

        public Builder() {
            this(BaseRealm.applicationContext);
        }

        private void checkModule(Object obj) {
            if (obj.getClass().isAnnotationPresent(RealmModule.class)) {
                return;
            }
            throw new IllegalArgumentException(obj.getClass().getCanonicalName() + " is not a RealmModule. Add @RealmModule to the class definition.");
        }

        private void initializeBuilder(Context context) {
            this.directory = context.getFilesDir();
            this.fileName = "default.realm";
            this.key = null;
            this.schemaVersion = 0L;
            this.migration = null;
            this.deleteRealmIfMigrationNeeded = false;
            this.durability = OsRealmConfig.Durability.FULL;
            this.readOnly = false;
            this.compactOnLaunch = null;
            if (RealmConfiguration.DEFAULT_MODULE != null) {
                this.modules.add(RealmConfiguration.DEFAULT_MODULE);
            }
            this.allowWritesOnUiThread = false;
            this.allowQueriesOnUiThread = true;
        }

        public final Builder addModule(Object obj) {
            if (obj != null) {
                checkModule(obj);
                this.modules.add(obj);
            }
            return this;
        }

        public Builder allowQueriesOnUiThread(boolean z10) {
            this.allowQueriesOnUiThread = z10;
            return this;
        }

        public Builder allowWritesOnUiThread(boolean z10) {
            this.allowWritesOnUiThread = z10;
            return this;
        }

        public Builder assetFile(String str) {
            if (Util.isEmptyString(str)) {
                throw new IllegalArgumentException("A non-empty asset file path must be provided");
            }
            if (this.durability == OsRealmConfig.Durability.MEM_ONLY) {
                throw new RealmException("Realm can not use in-memory configuration if asset file is present.");
            }
            if (this.deleteRealmIfMigrationNeeded) {
                throw new IllegalStateException("Realm cannot use an asset file when previously configured to clear its schema in migration by calling deleteRealmIfMigrationNeeded().");
            }
            this.assetFilePath = str;
            return this;
        }

        public RealmConfiguration build() {
            if (this.readOnly) {
                if (this.initialDataTransaction != null) {
                    throw new IllegalStateException("This Realm is marked as read-only. Read-only Realms cannot use initialData(Realm.Transaction).");
                }
                if (this.assetFilePath == null) {
                    throw new IllegalStateException("Only Realms provided using 'assetFile(path)' can be marked read-only. No such Realm was provided.");
                }
                if (this.deleteRealmIfMigrationNeeded) {
                    throw new IllegalStateException("'deleteRealmIfMigrationNeeded()' and read-only Realms cannot be combined");
                }
                if (this.compactOnLaunch != null) {
                    throw new IllegalStateException("'compactOnLaunch()' and read-only Realms cannot be combined");
                }
            }
            if (this.rxFactory == null && Util.isRxJavaAvailable()) {
                this.rxFactory = new RealmObservableFactory(true);
            }
            if (this.flowFactory == null && Util.isCoroutinesAvailable()) {
                this.flowFactory = new RealmFlowFactory(Boolean.TRUE);
            }
            return new RealmConfiguration(new File(this.directory, this.fileName), this.assetFilePath, this.key, this.schemaVersion, this.migration, this.deleteRealmIfMigrationNeeded, this.durability, RealmConfiguration.createSchemaMediator(this.modules, this.debugSchema, this.excludeDebugSchema), this.rxFactory, this.flowFactory, this.initialDataTransaction, this.readOnly, this.compactOnLaunch, false, this.maxNumberOfActiveVersions, this.allowWritesOnUiThread, this.allowQueriesOnUiThread);
        }

        public Builder compactOnLaunch() {
            return compactOnLaunch(new DefaultCompactOnLaunchCallback());
        }

        public Builder deleteRealmIfMigrationNeeded() {
            String str = this.assetFilePath;
            if (str != null && str.length() != 0) {
                throw new IllegalStateException("Realm cannot clear its schema when previously configured to use an asset file by calling assetFile().");
            }
            this.deleteRealmIfMigrationNeeded = true;
            return this;
        }

        public Builder directory(File file) {
            if (file == null) {
                throw new IllegalArgumentException("Non-null 'dir' required.");
            }
            if (file.isFile()) {
                throw new IllegalArgumentException("'dir' is a file, not a directory: " + file.getAbsolutePath() + ".");
            }
            if (!file.exists() && !file.mkdirs()) {
                throw new IllegalArgumentException("Could not create the specified directory: " + file.getAbsolutePath() + ".");
            }
            if (file.canWrite()) {
                this.directory = file;
                return this;
            }
            throw new IllegalArgumentException("Realm directory is not writable: " + file.getAbsolutePath() + ".");
        }

        public Builder encryptionKey(byte[] bArr) {
            if (bArr == null) {
                throw new IllegalArgumentException("A non-null key must be provided");
            }
            if (bArr.length == 64) {
                this.key = Arrays.copyOf(bArr, bArr.length);
                return this;
            }
            Locale locale = Locale.US;
            throw new IllegalArgumentException(c.r(bArr.length, "The provided key must be 64 bytes. Yours was: "));
        }

        public final Builder excludeSchema(Class<? extends RealmModel> cls, Class<? extends RealmModel>... clsArr) {
            this.excludeDebugSchema = true;
            return schema(cls, clsArr);
        }

        public Builder flowFactory(FlowFactory flowFactory) {
            if (flowFactory == null) {
                throw new IllegalArgumentException("The provided Flow factory must not be null.");
            }
            this.flowFactory = flowFactory;
            return this;
        }

        public Builder inMemory() {
            if (!Util.isEmptyString(this.assetFilePath)) {
                throw new RealmException("Realm can not use in-memory configuration if asset file is present.");
            }
            this.durability = OsRealmConfig.Durability.MEM_ONLY;
            return this;
        }

        public Builder initialData(Realm.Transaction transaction) {
            this.initialDataTransaction = transaction;
            return this;
        }

        public Builder maxNumberOfActiveVersions(long j) {
            if (j >= 1) {
                this.maxNumberOfActiveVersions = j;
                return this;
            }
            throw new IllegalArgumentException("Only positive numbers above 0 are allowed. Yours was: " + j);
        }

        public Builder migration(RealmMigration realmMigration) {
            if (realmMigration == null) {
                throw new IllegalArgumentException("A non-null migration must be provided");
            }
            this.migration = realmMigration;
            return this;
        }

        public Builder modules(Object obj, Object... objArr) {
            this.modules.clear();
            addModule(obj);
            if (objArr != null) {
                for (Object obj2 : objArr) {
                    addModule(obj2);
                }
            }
            return this;
        }

        public Builder name(String str) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("A non-empty filename must be provided");
            }
            this.fileName = str;
            return this;
        }

        public Builder readOnly() {
            this.readOnly = true;
            return this;
        }

        public Builder rxFactory(RxObservableFactory rxObservableFactory) {
            if (rxObservableFactory == null) {
                throw new IllegalArgumentException("The provided Rx Observable factory must not be null.");
            }
            this.rxFactory = rxObservableFactory;
            return this;
        }

        public final Builder schema(Class<? extends RealmModel> cls, Class<? extends RealmModel>... clsArr) {
            if (cls == null) {
                throw new IllegalArgumentException("A non-null class must be provided");
            }
            this.modules.clear();
            this.modules.add(RealmConfiguration.DEFAULT_MODULE_MEDIATOR);
            this.debugSchema.add(cls);
            if (clsArr != null) {
                Collections.addAll(this.debugSchema, clsArr);
            }
            return this;
        }

        public Builder schemaVersion(long j) {
            if (j >= 0) {
                this.schemaVersion = j;
                return this;
            }
            throw new IllegalArgumentException("Realm schema version numbers must be 0 (zero) or higher. Yours was: " + j);
        }

        public Builder(Context context) {
            this.modules = new HashSet<>();
            this.debugSchema = new HashSet<>();
            this.excludeDebugSchema = false;
            this.maxNumberOfActiveVersions = Long.MAX_VALUE;
            if (context == null) {
                throw new IllegalStateException("Call `Realm.init(Context)` before creating a RealmConfiguration");
            }
            RealmCore.loadLibrary(context);
            initializeBuilder(context);
        }

        public Builder compactOnLaunch(CompactOnLaunchCallback compactOnLaunchCallback) {
            if (compactOnLaunchCallback == null) {
                throw new IllegalArgumentException("A non-null compactOnLaunch must be provided");
            }
            this.compactOnLaunch = compactOnLaunchCallback;
            return this;
        }
    }

    static {
        Object defaultModule = Realm.getDefaultModule();
        DEFAULT_MODULE = defaultModule;
        if (defaultModule == null) {
            DEFAULT_MODULE_MEDIATOR = null;
            return;
        }
        RealmProxyMediator moduleMediator = getModuleMediator(defaultModule.getClass().getCanonicalName());
        if (!moduleMediator.transformerApplied()) {
            throw new ExceptionInInitializerError("RealmTransformer doesn't seem to be applied. Please update the project configuration to use the Realm Gradle plugin. See https://docs.mongodb.com/realm/sdk/android/install/#customize-dependecies-defined-by-the-realm-gradle-plugin");
        }
        DEFAULT_MODULE_MEDIATOR = moduleMediator;
    }

    public RealmConfiguration(File file, String str, byte[] bArr, long j, RealmMigration realmMigration, boolean z10, OsRealmConfig.Durability durability, RealmProxyMediator realmProxyMediator, RxObservableFactory rxObservableFactory, FlowFactory flowFactory, Realm.Transaction transaction, boolean z11, CompactOnLaunchCallback compactOnLaunchCallback, boolean z12, long j10, boolean z13, boolean z14) {
        this.realmDirectory = file.getParentFile();
        this.realmFileName = file.getName();
        this.canonicalPath = file.getAbsolutePath();
        this.assetFilePath = str;
        this.key = bArr;
        this.schemaVersion = j;
        this.migration = realmMigration;
        this.deleteRealmIfMigrationNeeded = z10;
        this.durability = durability;
        this.schemaMediator = realmProxyMediator;
        this.rxObservableFactory = rxObservableFactory;
        this.flowFactory = flowFactory;
        this.initialDataTransaction = transaction;
        this.readOnly = z11;
        this.compactOnLaunch = compactOnLaunchCallback;
        this.isRecoveryConfiguration = z12;
        this.maxNumberOfActiveVersions = j10;
        this.allowWritesOnUiThread = z13;
        this.allowQueriesOnUiThread = z14;
    }

    public static RealmProxyMediator createSchemaMediator(Set<Object> set, Set<Class<? extends RealmModel>> set2, boolean z10) {
        if (set2.size() > 0) {
            return new FilterableMediator(DEFAULT_MODULE_MEDIATOR, set2, z10);
        }
        if (set.size() == 1) {
            return getModuleMediator(set.iterator().next().getClass().getCanonicalName());
        }
        RealmProxyMediator[] realmProxyMediatorArr = new RealmProxyMediator[set.size()];
        Iterator<Object> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            realmProxyMediatorArr[i10] = getModuleMediator(it.next().getClass().getCanonicalName());
            i10++;
        }
        return new CompositeMediator(realmProxyMediatorArr);
    }

    public static RealmConfiguration forRecovery(String str, byte[] bArr, RealmProxyMediator realmProxyMediator) {
        return new RealmConfiguration(new File(str), null, bArr, 0L, null, false, OsRealmConfig.Durability.FULL, realmProxyMediator, null, null, null, true, null, true, Long.MAX_VALUE, false, true);
    }

    private static RealmProxyMediator getModuleMediator(String str) {
        String[] strArrSplit = str.split("\\.");
        String str2 = strArrSplit[strArrSplit.length - 1];
        Locale locale = Locale.US;
        String strD = a.D("io.realm.", str2, "Mediator");
        try {
            Constructor<?> constructor = Class.forName(strD).getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return (RealmProxyMediator) constructor.newInstance(null);
        } catch (ClassNotFoundException e10) {
            throw new RealmException("Could not find ".concat(strD), e10);
        } catch (IllegalAccessException e11) {
            throw new RealmException("Could not create an instance of ".concat(strD), e11);
        } catch (InstantiationException e12) {
            throw new RealmException("Could not create an instance of ".concat(strD), e12);
        } catch (InvocationTargetException e13) {
            throw new RealmException("Could not create an instance of ".concat(strD), e13);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RealmConfiguration realmConfiguration = (RealmConfiguration) obj;
            if (this.schemaVersion != realmConfiguration.schemaVersion || this.deleteRealmIfMigrationNeeded != realmConfiguration.deleteRealmIfMigrationNeeded || this.readOnly != realmConfiguration.readOnly || this.isRecoveryConfiguration != realmConfiguration.isRecoveryConfiguration) {
                return false;
            }
            File file = this.realmDirectory;
            if (file == null ? realmConfiguration.realmDirectory != null : !file.equals(realmConfiguration.realmDirectory)) {
                return false;
            }
            String str = this.realmFileName;
            if (str == null ? realmConfiguration.realmFileName != null : !str.equals(realmConfiguration.realmFileName)) {
                return false;
            }
            if (!this.canonicalPath.equals(realmConfiguration.canonicalPath)) {
                return false;
            }
            String str2 = this.assetFilePath;
            if (str2 == null ? realmConfiguration.assetFilePath != null : !str2.equals(realmConfiguration.assetFilePath)) {
                return false;
            }
            if (!Arrays.equals(this.key, realmConfiguration.key)) {
                return false;
            }
            RealmMigration realmMigration = this.migration;
            if (realmMigration == null ? realmConfiguration.migration != null : !realmMigration.equals(realmConfiguration.migration)) {
                return false;
            }
            if (this.durability != realmConfiguration.durability || !this.schemaMediator.equals(realmConfiguration.schemaMediator)) {
                return false;
            }
            RxObservableFactory rxObservableFactory = this.rxObservableFactory;
            if (rxObservableFactory == null ? realmConfiguration.rxObservableFactory != null : !rxObservableFactory.equals(realmConfiguration.rxObservableFactory)) {
                return false;
            }
            Realm.Transaction transaction = this.initialDataTransaction;
            if (transaction == null ? realmConfiguration.initialDataTransaction != null : !transaction.equals(realmConfiguration.initialDataTransaction)) {
                return false;
            }
            CompactOnLaunchCallback compactOnLaunchCallback = this.compactOnLaunch;
            if (compactOnLaunchCallback == null ? realmConfiguration.compactOnLaunch != null : !compactOnLaunchCallback.equals(realmConfiguration.compactOnLaunch)) {
                return false;
            }
            if (this.maxNumberOfActiveVersions == realmConfiguration.maxNumberOfActiveVersions) {
                return true;
            }
        }
        return false;
    }

    public String getAssetFilePath() {
        return this.assetFilePath;
    }

    public CompactOnLaunchCallback getCompactOnLaunchCallback() {
        return this.compactOnLaunch;
    }

    public OsRealmConfig.Durability getDurability() {
        return this.durability;
    }

    public byte[] getEncryptionKey() {
        byte[] bArr = this.key;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public FlowFactory getFlowFactory() {
        FlowFactory flowFactory = this.flowFactory;
        if (flowFactory != null) {
            return flowFactory;
        }
        throw new UnsupportedOperationException("The coroutines framework is missing from the classpath. Remember to add it as an implementation dependency. See https://github.com/Kotlin/kotlinx.coroutines#android for more details");
    }

    public Realm.Transaction getInitialDataTransaction() {
        return this.initialDataTransaction;
    }

    public Realm getInstance(OsSharedRealm.VersionID versionID) {
        return (Realm) RealmCache.createRealmOrGetFromCache(this, Realm.class, versionID);
    }

    public long getMaxNumberOfActiveVersions() {
        return this.maxNumberOfActiveVersions;
    }

    public RealmMigration getMigration() {
        return this.migration;
    }

    public String getPath() {
        return this.canonicalPath;
    }

    public File getRealmDirectory() {
        return this.realmDirectory;
    }

    public String getRealmFileName() {
        return this.realmFileName;
    }

    public Set<Class<? extends RealmModel>> getRealmObjectClasses() {
        return this.schemaMediator.getModelClasses();
    }

    public RxObservableFactory getRxFactory() {
        RxObservableFactory rxObservableFactory = this.rxObservableFactory;
        if (rxObservableFactory != null) {
            return rxObservableFactory;
        }
        throw new UnsupportedOperationException("RxJava seems to be missing from the classpath. Remember to add it as an implementation dependency. See https://github.com/realm/realm-java/tree/master/examples/rxJavaExample for more details.");
    }

    public RealmProxyMediator getSchemaMediator() {
        return this.schemaMediator;
    }

    public long getSchemaVersion() {
        return this.schemaVersion;
    }

    public boolean hasAssetFile() {
        return !Util.isEmptyString(this.assetFilePath);
    }

    public int hashCode() {
        File file = this.realmDirectory;
        int iHashCode = (file != null ? file.hashCode() : 0) * 31;
        String str = this.realmFileName;
        int iX = a.x(this.canonicalPath, (iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31);
        String str2 = this.assetFilePath;
        int iHashCode2 = (Arrays.hashCode(this.key) + ((iX + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        long j = this.schemaVersion;
        int i10 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        RealmMigration realmMigration = this.migration;
        int iHashCode3 = (this.schemaMediator.hashCode() + ((this.durability.hashCode() + ((((i10 + (realmMigration != null ? realmMigration.hashCode() : 0)) * 31) + (this.deleteRealmIfMigrationNeeded ? 1 : 0)) * 31)) * 31)) * 31;
        RxObservableFactory rxObservableFactory = this.rxObservableFactory;
        int iHashCode4 = (iHashCode3 + (rxObservableFactory != null ? rxObservableFactory.hashCode() : 0)) * 31;
        Realm.Transaction transaction = this.initialDataTransaction;
        int iHashCode5 = (((iHashCode4 + (transaction != null ? transaction.hashCode() : 0)) * 31) + (this.readOnly ? 1 : 0)) * 31;
        CompactOnLaunchCallback compactOnLaunchCallback = this.compactOnLaunch;
        int iHashCode6 = (((iHashCode5 + (compactOnLaunchCallback != null ? compactOnLaunchCallback.hashCode() : 0)) * 31) + (this.isRecoveryConfiguration ? 1 : 0)) * 31;
        long j10 = this.maxNumberOfActiveVersions;
        return iHashCode6 + ((int) (j10 ^ (j10 >>> 32)));
    }

    public boolean isAllowQueriesOnUiThread() {
        return this.allowQueriesOnUiThread;
    }

    public boolean isAllowWritesOnUiThread() {
        return this.allowWritesOnUiThread;
    }

    public boolean isReadOnly() {
        return this.readOnly;
    }

    public boolean isRecoveryConfiguration() {
        return this.isRecoveryConfiguration;
    }

    public boolean isSyncConfiguration() {
        return false;
    }

    public boolean realmExists() {
        return new File(this.canonicalPath).exists();
    }

    public boolean shouldDeleteRealmIfMigrationNeeded() {
        return this.deleteRealmIfMigrationNeeded;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("realmDirectory: ");
        File file = this.realmDirectory;
        sb.append(file != null ? file.toString() : "");
        sb.append("\nrealmFileName : ");
        sb.append(this.realmFileName);
        sb.append("\ncanonicalPath: ");
        sb.append(this.canonicalPath);
        sb.append("\nkey: [length: ");
        sb.append(this.key == null ? 0 : 64);
        sb.append("]\nschemaVersion: ");
        sb.append(Long.toString(this.schemaVersion));
        sb.append("\nmigration: ");
        sb.append(this.migration);
        sb.append("\ndeleteRealmIfMigrationNeeded: ");
        sb.append(this.deleteRealmIfMigrationNeeded);
        sb.append("\ndurability: ");
        sb.append(this.durability);
        sb.append("\nschemaMediator: ");
        sb.append(this.schemaMediator);
        sb.append("\nreadOnly: ");
        sb.append(this.readOnly);
        sb.append("\ncompactOnLaunch: ");
        sb.append(this.compactOnLaunch);
        sb.append("\nmaxNumberOfActiveVersions: ");
        sb.append(this.maxNumberOfActiveVersions);
        return sb.toString();
    }
}
