package W;

import Z.C0698o;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;

/* JADX INFO: renamed from: W.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0568i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z.M0 f9172a = new Z.M0(C0564h0.f9149s);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z.M0 f9173b = new Z.M0(C0564h0.f9150t);

    public static final long a(C0560g0 c0560g0, long j) {
        long j10 = c0560g0.f9112a;
        long j11 = c0560g0.f9126q;
        if (p180s0.q.c(j, j10)) {
            return c0560g0.f9113b;
        }
        if (p180s0.q.c(j, c0560g0.f9117f)) {
            return c0560g0.g;
        }
        if (p180s0.q.c(j, c0560g0.j)) {
            return c0560g0.f9120k;
        }
        if (p180s0.q.c(j, c0560g0.f9123n)) {
            return c0560g0.f9124o;
        }
        if (p180s0.q.c(j, c0560g0.f9132w)) {
            return c0560g0.f9133x;
        }
        if (p180s0.q.c(j, c0560g0.f9114c)) {
            return c0560g0.f9115d;
        }
        if (p180s0.q.c(j, c0560g0.f9118h)) {
            return c0560g0.f9119i;
        }
        if (p180s0.q.c(j, c0560g0.f9121l)) {
            return c0560g0.f9122m;
        }
        if (p180s0.q.c(j, c0560g0.f9134y)) {
            return c0560g0.f9135z;
        }
        if (p180s0.q.c(j, c0560g0.f9130u)) {
            return c0560g0.f9131v;
        }
        if (p180s0.q.c(j, c0560g0.f9125p)) {
            return j11;
        }
        if (p180s0.q.c(j, c0560g0.f9127r)) {
            return c0560g0.f9128s;
        }
        if (p180s0.q.c(j, c0560g0.f9099D) || p180s0.q.c(j, c0560g0.f9101F) || p180s0.q.c(j, c0560g0.f9102G) || p180s0.q.c(j, c0560g0.f9103H) || p180s0.q.c(j, c0560g0.f9104I) || p180s0.q.c(j, c0560g0.f9105J)) {
            return j11;
        }
        int i10 = p180s0.q.f21844h;
        return p180s0.q.g;
    }

    public static final long b(long j, C0698o c0698o) {
        c0698o.T(-1680936624);
        long jA = a((C0560g0) c0698o.k(f9172a), j);
        if (jA == 16) {
            jA = ((p180s0.q) c0698o.k(AbstractC0592q0.f9328a)).f21845a;
        }
        c0698o.p(false);
        return jA;
    }

    public static final long c(C0560g0 c0560g0, int i10) {
        switch (AbstractC0607v1.b(i10)) {
            case 0:
                return c0560g0.f9123n;
            case 1:
                return c0560g0.f9132w;
            case 2:
                return c0560g0.f9134y;
            case 3:
                return c0560g0.f9131v;
            case 4:
                return c0560g0.f9116e;
            case 5:
                return c0560g0.f9130u;
            case 6:
                return c0560g0.f9124o;
            case 7:
                return c0560g0.f9133x;
            case 8:
                return c0560g0.f9135z;
            case 9:
                return c0560g0.f9113b;
            case 10:
                return c0560g0.f9115d;
            case 11:
            case 12:
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
            case 21:
            case 22:
            case 27:
            case 28:
            case 32:
            case 33:
            default:
                return p180s0.q.g;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return c0560g0.g;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return c0560g0.f9119i;
            case 17:
                return c0560g0.f9126q;
            case 18:
                return c0560g0.f9128s;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                return c0560g0.f9120k;
            case 20:
                return c0560g0.f9122m;
            case 23:
                return c0560g0.f9096A;
            case 24:
                return c0560g0.f9097B;
            case 25:
                return c0560g0.f9112a;
            case 26:
                return c0560g0.f9114c;
            case 29:
                return c0560g0.f9098C;
            case 30:
                return c0560g0.f9117f;
            case 31:
                return c0560g0.f9118h;
            case 34:
                return c0560g0.f9125p;
            case 35:
                return c0560g0.f9099D;
            case 36:
                return c0560g0.f9101F;
            case 37:
                return c0560g0.f9102G;
            case 38:
                return c0560g0.f9103H;
            case 39:
                return c0560g0.f9104I;
            case 40:
                return c0560g0.f9105J;
            case 41:
                return c0560g0.f9100E;
            case 42:
                return c0560g0.f9129t;
            case 43:
                return c0560g0.f9127r;
            case 44:
                return c0560g0.j;
            case 45:
                return c0560g0.f9121l;
        }
    }

    public static final long d(int i10, C0698o c0698o) {
        return c((C0560g0) c0698o.k(f9172a), i10);
    }
}
