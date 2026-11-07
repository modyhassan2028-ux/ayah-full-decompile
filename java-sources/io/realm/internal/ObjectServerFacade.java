package io.realm.internal;

import android.content.Context;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.exceptions.RealmException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class ObjectServerFacade {
    public static final int SYNC_CONFIG_OPTIONS = 19;
    private static final ObjectServerFacade nonSyncFacade = new ObjectServerFacade();
    private static ObjectServerFacade syncFacade;

    public interface RealmCacheAccessor {
        Realm createRealmOrGetFromCache(RealmConfiguration realmConfiguration, OsSharedRealm.VersionID versionID);
    }

    public interface RealmInstanceFactory {
        Realm createInstance(OsSharedRealm osSharedRealm);
    }

    static {
        syncFacade = null;
        try {
            syncFacade = (ObjectServerFacade) Class.forName("io.realm.internal.SyncObjectServerFacade").getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException e10) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e10);
        } catch (InstantiationException e11) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e11);
        } catch (NoSuchMethodException e12) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e12);
        } catch (InvocationTargetException e13) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e13.getTargetException());
        }
    }

    public static ObjectServerFacade getFacade(boolean z10) {
        return z10 ? syncFacade : nonSyncFacade;
    }

    public static ObjectServerFacade getSyncFacadeIfPossible() {
        ObjectServerFacade objectServerFacade = syncFacade;
        return objectServerFacade != null ? objectServerFacade : nonSyncFacade;
    }

    public void checkFlexibleSyncEnabled(RealmConfiguration realmConfiguration) {
    }

    public void createNativeSyncSession(RealmConfiguration realmConfiguration) {
    }

    public void downloadInitialFlexibleSyncData(Realm realm, RealmConfiguration realmConfiguration) {
    }

    public void downloadInitialRemoteChanges(RealmConfiguration realmConfiguration) {
    }

    public Object[] getSyncConfigurationOptions(RealmConfiguration realmConfiguration) {
        return new Object[19];
    }

    public String getSyncServerCertificateAssetName(RealmConfiguration realmConfiguration) {
        return null;
    }

    public String getSyncServerCertificateFilePath(RealmConfiguration realmConfiguration) {
        return null;
    }

    public void initialize(Context context, String str, RealmCacheAccessor realmCacheAccessor, RealmInstanceFactory realmInstanceFactory) {
    }

    public void realmClosed(RealmConfiguration realmConfiguration) {
    }

    public boolean wasDownloadInterrupted(Throwable th) {
        return false;
    }

    public void wrapObjectStoreSessionIfRequired(OsRealmConfig osRealmConfig) {
    }
}
