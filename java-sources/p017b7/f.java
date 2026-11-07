package p017b7;

import C9.b;
import H8.e;
import U6.C0532j;
import U6.y;
import a7.a;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p014b3.c;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final R7.f f13311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0532j f13312c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f13314e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f13315f = null;
    public static boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f13316h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Boolean f13317i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e f13319l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static j f13320m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static k f13321n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13322a;
    public static final ThreadLocal j = new ThreadLocal();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f13318k = new b(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f13313d = new e(23);

    static {
        int i10 = 22;
        f13319l = new e(i10);
        f13311b = new R7.f(i10);
        f13312c = new C0532j(i10);
    }

    public f(Context context) {
        this.f13322a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (y.i(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0260  */
    /* JADX WARN: Code duplicated, block: B:117:0x0266  */
    /* JADX WARN: Code duplicated, block: B:120:0x026f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0280 A[Catch: all -> 0x0085, TryCatch #3 {all -> 0x0085, blocks: (B:7:0x004b, B:11:0x007f, B:18:0x008b, B:21:0x0091, B:24:0x00a5, B:102:0x020d, B:103:0x0214, B:106:0x0217, B:107:0x0218, B:108:0x021f, B:125:0x0280, B:126:0x0291, B:109:0x0220, B:111:0x023e, B:113:0x024c, B:123:0x0278, B:124:0x027f, B:127:0x0292, B:128:0x02be), top: B:146:0x004b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0091 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #3 {all -> 0x0085, blocks: (B:7:0x004b, B:11:0x007f, B:18:0x008b, B:21:0x0091, B:24:0x00a5, B:102:0x020d, B:103:0x0214, B:106:0x0217, B:107:0x0218, B:108:0x021f, B:125:0x0280, B:126:0x0291, B:109:0x0220, B:111:0x023e, B:113:0x024c, B:123:0x0278, B:124:0x027f, B:127:0x0292, B:128:0x02be), top: B:146:0x004b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b0 A[Catch: all -> 0x0201, TryCatch #2 {, blocks: (B:27:0x00aa, B:29:0x00b0, B:30:0x00b2, B:98:0x0203, B:99:0x020a), top: B:145:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b5 A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TRY_ENTER, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00dd A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TRY_ENTER, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0159 A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0164 A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0183 A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0196 A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x019e A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01af A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01b9 A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01ca A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01e0 A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01e9 A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01f1 A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01f9 A[Catch: all -> 0x0118, b -> 0x011b, RemoteException -> 0x011e, TryCatch #8 {RemoteException -> 0x011e, b -> 0x011b, all -> 0x0118, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:59:0x0136, B:61:0x013e, B:63:0x0146, B:64:0x014d, B:58:0x0121, B:67:0x0150, B:68:0x0151, B:69:0x0158, B:70:0x0159, B:71:0x0160, B:74:0x0163, B:75:0x0164, B:77:0x0183, B:79:0x0196, B:81:0x019e, B:87:0x01da, B:89:0x01e0, B:90:0x01e9, B:91:0x01f0, B:82:0x01af, B:83:0x01b6, B:85:0x01b9, B:86:0x01ca, B:92:0x01f1, B:93:0x01f8, B:94:0x01f9, B:95:0x0200, B:101:0x020c), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0203 A[Catch: all -> 0x0201, TRY_ENTER, TryCatch #2 {, blocks: (B:27:0x00aa, B:29:0x00b0, B:30:0x00b2, B:98:0x0203, B:99:0x020a), top: B:145:0x00aa }] */
    /* JADX WARN: Instruction removed from duplicated block: B:125:0x0280, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00bc, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x0164, please report this as an issue */
    public static f c(Context context, e eVar, String str) throws Throwable {
        long j10;
        f fVar;
        int i10;
        Boolean bool;
        j jVarH;
        int i11;
        a aVarG0;
        Object objG0;
        f fVar2;
        i iVar;
        k kVar;
        i iVar2;
        boolean z10;
        a aVarG1;
        Cursor cursor;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new b("null application Context");
        }
        ThreadLocal threadLocal = j;
        i iVar3 = (i) threadLocal.get();
        i iVar4 = new i();
        threadLocal.set(iVar4);
        b bVar = f13318k;
        Long l10 = (Long) bVar.get();
        long jLongValue = l10.longValue();
        try {
            bVar.set(Long.valueOf(SystemClock.uptimeMillis()));
            d dVarI = eVar.i(context, str, f13319l);
            j10 = jLongValue;
            try {
                Log.i("DynamiteModule", "Considering local module " + str + ":" + dVarI.f13308a + " and remote module " + str + ":" + dVarI.f13309b);
                int i12 = dVarI.f13310c;
                if (i12 != 0) {
                    if (i12 != -1) {
                        if (i12 == 1 || dVarI.f13309b != 0) {
                            if (i12 == -1) {
                                Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                fVar = new f(applicationContext);
                            } else {
                                if (i12 == 1) {
                                    throw new b("VersionPolicy returned invalid code:" + i12);
                                }
                                try {
                                    i10 = dVarI.f13309b;
                                    try {
                                        synchronized (f.class) {
                                            if (g(context)) {
                                                throw new b("Remote loading disabled");
                                            }
                                            bool = f13314e;
                                        }
                                        if (bool != null) {
                                            throw new b("Failed to determine which loading route to use.");
                                        }
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                            synchronized (f.class) {
                                                kVar = f13321n;
                                            }
                                            if (kVar != null) {
                                                throw new b("DynamiteLoaderV2 was not cached.");
                                            }
                                            iVar2 = (i) threadLocal.get();
                                            if (iVar2 != null || iVar2.f13326a == null) {
                                                throw new b("No result cursor");
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor2 = iVar2.f13326a;
                                            new a7.b(null);
                                            synchronized (f.class) {
                                                z10 = f13316h >= 2;
                                            }
                                            if (z10) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                aVarG1 = kVar.H0(new a7.b(applicationContext2), str, i10, new a7.b(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                aVarG1 = kVar.G0(new a7.b(applicationContext2), str, i10, new a7.b(cursor2));
                                            }
                                            Context context2 = (Context) a7.b.G0(aVarG1);
                                            if (context2 == null) {
                                                throw new b("Failed to get module context");
                                            }
                                            fVar2 = new f(context2);
                                        } else {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                            jVarH = h(context);
                                            if (jVarH != null) {
                                                throw new b("Failed to create IDynamiteLoader.");
                                            }
                                            Parcel parcelA = jVarH.a(jVarH.g(), 6);
                                            i11 = parcelA.readInt();
                                            parcelA.recycle();
                                            if (i11 >= 3) {
                                                iVar = (i) threadLocal.get();
                                                if (iVar != null) {
                                                    throw new b("No cached result cursor holder");
                                                }
                                                aVarG0 = jVarH.H0(new a7.b(context), str, i10, new a7.b(iVar.f13326a));
                                            } else if (i11 == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                aVarG0 = jVarH.I0(new a7.b(context), str, i10);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                aVarG0 = jVarH.G0(new a7.b(context), str, i10);
                                            }
                                            objG0 = a7.b.G0(aVarG0);
                                            if (objG0 != null) {
                                                throw new b("Failed to load remote module.");
                                            }
                                            fVar2 = new f((Context) objG0);
                                        }
                                        fVar = fVar2;
                                    } catch (RemoteException e10) {
                                        throw new b("Failed to load remote module.", e10);
                                    } catch (b e11) {
                                        throw e11;
                                    } catch (Throwable th) {
                                        throw new b("Failed to load remote module.", th);
                                    }
                                } catch (b e12) {
                                    Log.w("DynamiteModule", "Failed to load remote module: " + e12.getMessage());
                                    int i13 = dVarI.f13308a;
                                    if (i13 == 0 || eVar.i(context, str, new c(i13, false)).f13310c != -1) {
                                        throw new b("Remote load failed. No local fallback found.", e12);
                                    }
                                    Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                    fVar = new f(applicationContext);
                                }
                            }
                            if (j10 == 0) {
                                f13318k.remove();
                            } else {
                                f13318k.set(l10);
                            }
                            cursor = iVar4.f13326a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            j.set(iVar3);
                            return fVar;
                        }
                    } else if (dVarI.f13308a != 0) {
                        i12 = -1;
                        if (i12 == 1) {
                        }
                        if (i12 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            fVar = new f(applicationContext);
                        } else {
                            if (i12 == 1) {
                                throw new b("VersionPolicy returned invalid code:" + i12);
                            }
                            i10 = dVarI.f13309b;
                            synchronized (f.class) {
                                if (g(context)) {
                                    throw new b("Remote loading disabled");
                                }
                                bool = f13314e;
                                if (bool != null) {
                                    throw new b("Failed to determine which loading route to use.");
                                }
                                if (bool.booleanValue()) {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                    synchronized (f.class) {
                                        kVar = f13321n;
                                        if (kVar != null) {
                                            throw new b("DynamiteLoaderV2 was not cached.");
                                        }
                                        iVar2 = (i) threadLocal.get();
                                        if (iVar2 != null) {
                                        }
                                        throw new b("No result cursor");
                                    }
                                }
                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                jVarH = h(context);
                                if (jVarH != null) {
                                    throw new b("Failed to create IDynamiteLoader.");
                                }
                                Parcel parcelA2 = jVarH.a(jVarH.g(), 6);
                                i11 = parcelA2.readInt();
                                parcelA2.recycle();
                                if (i11 >= 3) {
                                    iVar = (i) threadLocal.get();
                                    if (iVar != null) {
                                        throw new b("No cached result cursor holder");
                                    }
                                    aVarG0 = jVarH.H0(new a7.b(context), str, i10, new a7.b(iVar.f13326a));
                                } else if (i11 == 2) {
                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                    aVarG0 = jVarH.I0(new a7.b(context), str, i10);
                                } else {
                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                    aVarG0 = jVarH.G0(new a7.b(context), str, i10);
                                }
                                objG0 = a7.b.G0(aVarG0);
                                if (objG0 != null) {
                                    throw new b("Failed to load remote module.");
                                }
                                fVar2 = new f((Context) objG0);
                                fVar = fVar2;
                            }
                        }
                        if (j10 == 0) {
                            f13318k.remove();
                        } else {
                            f13318k.set(l10);
                        }
                        cursor = iVar4.f13326a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        j.set(iVar3);
                        return fVar;
                    }
                }
                throw new b("No acceptable module " + str + " found. Local version is " + dVarI.f13308a + " and remote version is " + dVarI.f13309b + ".");
            } catch (Throwable th2) {
                th = th2;
                if (j10 == 0) {
                    f13318k.remove();
                } else {
                    f13318k.set(l10);
                }
                Cursor cursor3 = iVar4.f13326a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                j.set(iVar3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j10 = jLongValue;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0 A[Catch: all -> 0x0037, TryCatch #12 {all -> 0x0037, blocks: (B:9:0x0027, B:11:0x0033, B:51:0x00b9, B:16:0x003c, B:18:0x0043, B:20:0x0049, B:25:0x0050, B:27:0x0054, B:30:0x005d, B:32:0x0065, B:35:0x006c, B:42:0x0098, B:43:0x00a0, B:38:0x0073, B:40:0x0079, B:41:0x008a, B:46:0x00a3, B:49:0x00a6, B:50:0x00b0, B:17:0x003f), top: B:149:0x0027, inners: #0 }] */
    public static int d(Context context, String str, boolean z10) {
        Throwable th;
        RemoteException remoteException;
        int i10;
        Cursor cursor;
        try {
            synchronized (f.class) {
                Boolean bool = f13314e;
                boolean z11 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        f(classLoader);
                                    } catch (b unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!g(context)) {
                                        return 0;
                                    }
                                    if (g) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iE = e(context, str, z10, true);
                                                String str2 = f13315f;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderE0 = g.E0();
                                                    if (classLoaderE0 == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            a.b();
                                                            String str3 = f13315f;
                                                            y.f(str3);
                                                            classLoaderE0 = a.a(ClassLoader.getSystemClassLoader(), str3);
                                                        } else {
                                                            String str4 = f13315f;
                                                            y.f(str4);
                                                            classLoaderE0 = new h(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    f(classLoaderE0);
                                                    declaredField.set(null, classLoaderE0);
                                                    f13314e = bool2;
                                                    return iE;
                                                }
                                                return iE;
                                            } catch (b unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f13314e = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e10) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e10.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z10, false);
                    } catch (b e11) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e11.getMessage());
                        return 0;
                    }
                }
                j jVarH = h(context);
                try {
                    if (jVarH == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelA = jVarH.a(jVarH.g(), 6);
                        int i11 = parcelA.readInt();
                        parcelA.recycle();
                        if (i11 >= 3) {
                            ThreadLocal threadLocal = j;
                            i iVar = (i) threadLocal.get();
                            if (iVar != null && (cursor = iVar.f13326a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) a7.b.G0(jVarH.J0(new a7.b(context), str, z10, ((Long) f13318k.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i10 = cursor3.getInt(0);
                                        if (i10 > 0) {
                                            i iVar2 = (i) threadLocal.get();
                                            if (iVar2 == null || iVar2.f13326a != null) {
                                                z11 = false;
                                            } else {
                                                iVar2.f13326a = cursor3;
                                            }
                                            cursor2 = z11 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e12) {
                                    remoteException = e12;
                                    cursor2 = cursor3;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + remoteException.getMessage());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 == null) {
                                        throw th;
                                    }
                                    cursor2.close();
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i11 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            a7.b bVar = new a7.b(context);
                            Parcel parcelG = jVarH.g();
                            p049e7.a.c(parcelG, bVar);
                            parcelG.writeString(str);
                            parcelG.writeInt(z10 ? 1 : 0);
                            Parcel parcelA2 = jVarH.a(parcelG, 5);
                            i10 = parcelA2.readInt();
                            parcelA2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            a7.b bVar2 = new a7.b(context);
                            Parcel parcelG2 = jVarH.g();
                            p049e7.a.c(parcelG2, bVar2);
                            parcelG2.writeString(str);
                            parcelG2.writeInt(z10 ? 1 : 0);
                            Parcel parcelA3 = jVarH.a(parcelG2, 3);
                            i10 = parcelA3.readInt();
                            parcelA3.recycle();
                        }
                        return i10;
                    } catch (RemoteException e13) {
                        remoteException = e13;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            try {
                y.f(context);
                throw th5;
            } catch (Exception e14) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e14);
                throw th5;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0137 A[PHI: r13
      0x0137: PHI (r13v6 boolean) = (r13v5 boolean), (r13v9 boolean) binds: [B:59:0x00ee, B:84:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    public static int e(Context context, String str, boolean z10, boolean z11) throws Throwable {
        Exception exc;
        Throwable th;
        MatrixCursor matrixCursor;
        boolean z12;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z13 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z10 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) f13318k.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z14 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i10 = 0; i10 < count; i10++) {
                                    if (!cursorQuery.moveToPosition(i10)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i11 = 0; i11 < columnCount; i11++) {
                                        int type = cursorQuery.getType(i11);
                                        if (type == 0) {
                                            objArr[i11] = null;
                                        } else if (type == 1) {
                                            objArr[i11] = Long.valueOf(cursorQuery.getLong(i11));
                                        } else if (type == 2) {
                                            objArr[i11] = Double.valueOf(cursorQuery.getDouble(i11));
                                        } else if (type == 3) {
                                            objArr[i11] = cursorQuery.getString(i11);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i11] = cursorQuery.getBlob(i11);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i12 = matrixCursor.getInt(0);
                            if (i12 > 0) {
                                synchronized (f.class) {
                                    try {
                                        f13315f = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f13316h = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z12 = matrixCursor.getInt(columnIndex2) != 0;
                                            g = z12;
                                        } else {
                                            z12 = false;
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                                i iVar = (i) j.get();
                                if (iVar == null || iVar.f13326a != null) {
                                    z13 = false;
                                } else {
                                    iVar.f13326a = matrixCursor;
                                }
                                z14 = z12;
                                matrixCursor2 = z13 ? null : matrixCursor;
                            }
                            if (z11 && z14) {
                                throw new b("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i12;
                        }
                    } catch (Exception e10) {
                        exc = e10;
                        if (exc instanceof b) {
                            throw exc;
                        }
                        throw new b("V2 version check failed: " + exc.getMessage(), exc);
                    } catch (Throwable th6) {
                        th = th6;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th;
                        }
                        matrixCursor2.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new b("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e11) {
            exc = e11;
        }
    }

    public static void f(ClassLoader classLoader) throws b {
        try {
            k kVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                kVar = iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new k(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 2);
            }
            f13321n = kVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new b("Failed to instantiate dynamite loader", e10);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f13317i)) {
            return true;
        }
        boolean z10 = false;
        if (f13317i == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (R6.f.f7246b.b(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z10 = true;
            }
            f13317i = Boolean.valueOf(z10);
            if (z10 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                g = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    public static j h(Context context) {
        j jVar;
        synchronized (f.class) {
            j jVar2 = f13320m;
            if (jVar2 != null) {
                return jVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    jVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    jVar = iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new j(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 2);
                }
                if (jVar != null) {
                    f13320m = jVar;
                    return jVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) throws b {
        try {
            return (IBinder) this.f13322a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new b("Failed to instantiate module class: ".concat(str), e10);
        }
    }
}
