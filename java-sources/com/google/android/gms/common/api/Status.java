package com.google.android.gms.common.api;

import E2.O;
import L5.c;
import R6.b;
import U6.y;
import V6.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.util.Arrays;
import p017b7.g;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new O(9);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f13984r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f13985s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final PendingIntent f13986t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b f13987u;

    public Status(int i10, String str, PendingIntent pendingIntent, b bVar) {
        this.f13984r = i10;
        this.f13985s = str;
        this.f13986t = pendingIntent;
        this.f13987u = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f13984r == status.f13984r && y.i(this.f13985s, status.f13985s) && y.i(this.f13986t, status.f13986t) && y.i(this.f13987u, status.f13987u);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13984r), this.f13985s, this.f13986t, this.f13987u});
    }

    public final String toString() {
        c cVar = new c(this);
        String strR = this.f13985s;
        if (strR == null) {
            int i10 = this.f13984r;
            switch (i10) {
                case -1:
                    strR = "SUCCESS_CACHE";
                    break;
                case 0:
                    strR = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    strR = p123m2.c.r(i10, "unknown status code: ");
                    break;
                case 2:
                    strR = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    strR = "SERVICE_DISABLED";
                    break;
                case 4:
                    strR = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    strR = "INVALID_ACCOUNT";
                    break;
                case 6:
                    strR = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    strR = "NETWORK_ERROR";
                    break;
                case 8:
                    strR = "INTERNAL_ERROR";
                    break;
                case 10:
                    strR = "DEVELOPER_ERROR";
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                    strR = "ERROR";
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                    strR = "INTERRUPTED";
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                    strR = "TIMEOUT";
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                    strR = "CANCELED";
                    break;
                case 17:
                    strR = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strR = "DEAD_CLIENT";
                    break;
                case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                    strR = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strR = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    strR = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strR = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        cVar.k(strR, "statusCode");
        cVar.k(this.f13986t, "resolution");
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iD0 = g.D0(parcel, 20293);
        g.G0(parcel, 1, 4);
        parcel.writeInt(this.f13984r);
        g.z0(parcel, 2, this.f13985s);
        g.y0(parcel, 3, this.f13986t, i10);
        g.y0(parcel, 4, this.f13987u, i10);
        g.F0(parcel, iD0);
    }
}
