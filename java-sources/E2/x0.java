package E2;

import H7.C0229c;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import p151p.T0;
import p151p.g1;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1793a;

    public /* synthetic */ x0(int i10) {
        this.f1793a = i10;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f1793a) {
            case 0:
                return new y0(parcel, classLoader);
            case 1:
                return new C0229c(parcel, classLoader);
            case 2:
                return new H7.y(parcel, classLoader);
            case 3:
                return new K7.j(parcel, classLoader);
            case 4:
                return new K7.n(parcel, classLoader);
            case 5:
                return new P2.g(parcel);
            case 6:
                return new P7.a(parcel, classLoader);
            case 7:
                return new P7.i(parcel, classLoader);
            case 8:
                if (parcel.readParcelable(classLoader) == null) {
                    return Q1.b.f6851s;
                }
                throw new IllegalStateException("superState must be null");
            case 9:
                return new S7.d(parcel, classLoader);
            case 10:
                return new V7.a(parcel, classLoader);
            case 11:
                return new X7.y(parcel, classLoader);
            case 12:
                return new Z1.d(parcel, classLoader);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return new Z2.k(parcel, classLoader);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                if (Build.VERSION.SDK_INT >= 24) {
                    return new p014b3.o(parcel, classLoader);
                }
                p014b3.o oVar = new p014b3.o(parcel);
                oVar.f13232r = parcel.readInt();
                oVar.f13233s = parcel.readInt();
                oVar.f13234t = parcel.readParcelable(null);
                return oVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return new T0(parcel, classLoader);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                return new g1(parcel, classLoader);
            case 17:
                return new p177r7.f(parcel, classLoader);
            case 18:
                return new p193t7.b(parcel, classLoader);
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                return new u1.f(parcel, classLoader);
            default:
                return new p202u7.b(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f1793a) {
            case 0:
                return new y0[i10];
            case 1:
                return new C0229c[i10];
            case 2:
                return new H7.y[i10];
            case 3:
                return new K7.j[i10];
            case 4:
                return new K7.n[i10];
            case 5:
                return new P2.g[i10];
            case 6:
                return new P7.a[i10];
            case 7:
                return new P7.i[i10];
            case 8:
                return new Q1.b[i10];
            case 9:
                return new S7.d[i10];
            case 10:
                return new V7.a[i10];
            case 11:
                return new X7.y[i10];
            case 12:
                return new Z1.d[i10];
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return new Z2.k[i10];
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return new p014b3.o[i10];
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return new T0[i10];
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                return new g1[i10];
            case 17:
                return new p177r7.f[i10];
            case 18:
                return new p193t7.b[i10];
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                return new u1.f[i10];
            default:
                return new p202u7.b[i10];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1793a) {
            case 0:
                return new y0(parcel, null);
            case 1:
                return new C0229c(parcel, null);
            case 2:
                return new H7.y(parcel, null);
            case 3:
                return new K7.j(parcel, null);
            case 4:
                return new K7.n(parcel, null);
            case 5:
                return new P2.g(parcel);
            case 6:
                return new P7.a(parcel, null);
            case 7:
                return new P7.i(parcel, null);
            case 8:
                if (parcel.readParcelable(null) == null) {
                    return Q1.b.f6851s;
                }
                throw new IllegalStateException("superState must be null");
            case 9:
                return new S7.d(parcel, null);
            case 10:
                return new V7.a(parcel, null);
            case 11:
                return new X7.y(parcel, null);
            case 12:
                return new Z1.d(parcel, null);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return new Z2.k(parcel, null);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                if (Build.VERSION.SDK_INT >= 24) {
                    return new p014b3.o(parcel, null);
                }
                p014b3.o oVar = new p014b3.o(parcel);
                oVar.f13232r = parcel.readInt();
                oVar.f13233s = parcel.readInt();
                oVar.f13234t = parcel.readParcelable(null);
                return oVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return new T0(parcel, null);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                return new g1(parcel, null);
            case 17:
                return new p177r7.f(parcel, null);
            case 18:
                return new p193t7.b(parcel, null);
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                return new u1.f(parcel, null);
            default:
                return new p202u7.b(parcel, null);
        }
    }
}
