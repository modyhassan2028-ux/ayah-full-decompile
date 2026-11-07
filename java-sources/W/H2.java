package W;

import Z.C0698o;
import io.realm.RealmFieldTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class H2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z.M0 f8580a = new Z.M0(C0564h0.f9148D);

    public static final U0.L a(int i10, C0698o c0698o) {
        G2 g10 = (G2) c0698o.k(f8580a);
        switch (AbstractC0607v1.b(i10)) {
            case 0:
                return g10.j;
            case 1:
                return g10.f8565k;
            case 2:
                return g10.f8566l;
            case 3:
                return g10.f8557a;
            case 4:
                return g10.f8558b;
            case 5:
                return g10.f8559c;
            case 6:
                return g10.f8560d;
            case 7:
                return g10.f8561e;
            case 8:
                return g10.f8562f;
            case 9:
                return g10.f8567m;
            case 10:
                return g10.f8568n;
            case 11:
                return g10.f8569o;
            case 12:
                return g10.g;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return g10.f8563h;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return g10.f8564i;
            default:
                throw new A6.a();
        }
    }
}
