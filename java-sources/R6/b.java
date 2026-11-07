package R6;

import E2.O;
import U6.y;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b extends V6.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f7233r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f7234s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final PendingIntent f7235t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f7236u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f7232v = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new O(5);

    public b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f7233r = i10;
        this.f7234s = i11;
        this.f7235t = pendingIntent;
        this.f7236u = str;
    }

    public static String b(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        return "CANCELED";
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        return "TIMEOUT";
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        return "INTERRUPTED";
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return p245z2.a.B(i10, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7234s == bVar.f7234s && y.i(this.f7235t, bVar.f7235t) && y.i(this.f7236u, bVar.f7236u);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7234s), this.f7235t, this.f7236u});
    }

    public final String toString() {
        L5.c cVar = new L5.c(this);
        cVar.k(b(this.f7234s), "statusCode");
        cVar.k(this.f7235t, "resolution");
        cVar.k(this.f7236u, "message");
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iD0 = p017b7.g.D0(parcel, 20293);
        p017b7.g.G0(parcel, 1, 4);
        parcel.writeInt(this.f7233r);
        p017b7.g.G0(parcel, 2, 4);
        parcel.writeInt(this.f7234s);
        p017b7.g.y0(parcel, 3, this.f7235t, i10);
        p017b7.g.z0(parcel, 4, this.f7236u);
        p017b7.g.F0(parcel, iD0);
    }

    public b(int i10) {
        this(1, i10, null, null);
    }

    public b(int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, null);
    }
}
