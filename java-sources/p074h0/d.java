package p074h0;

import A.N0;
import G.C;
import K.v0;
import W.C0563h;
import Z.C0698o;
import Z.C0699o0;
import java.io.Serializable;
import java.util.ArrayList;
import p241y9.e;
import p241y9.f;
import p241y9.g;
import p241y9.h;
import p241y9.i;
import p251z9.j;
import p251z9.y;

/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f16411r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f16412s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f16413t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0699o0 f16414u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f16415v;

    public d(int i10, Object obj, boolean z10) {
        this.f16411r = i10;
        this.f16412s = z10;
        this.f16413t = obj;
    }

    @Override // p241y9.h
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        return g(obj, obj2, obj3, (C0698o) obj4, ((Number) serializable).intValue());
    }

    public final Object b(int i10, C0698o c0698o) {
        c0698o.V(this.f16411r);
        j(c0698o);
        int iA = i10 | (c0698o.g(this) ? j.a(2, 0) : j.a(1, 0));
        Object obj = this.f16413t;
        j.c(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        y.b(2, obj);
        Object objInvoke = ((e) obj).invoke(c0698o, Integer.valueOf(iA));
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new N0(2, this, d.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 1);
        }
        return objInvoke;
    }

    public final Object c(Object obj, C0698o c0698o, int i10) {
        c0698o.V(this.f16411r);
        j(c0698o);
        int iA = c0698o.g(this) ? j.a(2, 1) : j.a(1, 1);
        Object obj2 = this.f16413t;
        j.c(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        y.b(3, obj2);
        Object objD = ((f) obj2).d(obj, c0698o, Integer.valueOf(iA | i10));
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C(i10, 6, this, obj);
        }
        return objD;
    }

    @Override // p241y9.f
    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return c(obj, (C0698o) obj2, ((Number) obj3).intValue());
    }

    public final Object f(Object obj, Object obj2, C0698o c0698o, int i10) {
        c0698o.V(this.f16411r);
        j(c0698o);
        int iA = c0698o.g(this) ? j.a(2, 2) : j.a(1, 2);
        Object obj3 = this.f16413t;
        j.c(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        y.b(4, obj3);
        Object objI = ((g) obj3).i(obj, obj2, c0698o, Integer.valueOf(iA | i10));
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new v0(this, obj, obj2, i10, 3);
        }
        return objI;
    }

    public final Object g(Object obj, Object obj2, Object obj3, C0698o c0698o, int i10) {
        c0698o.V(this.f16411r);
        j(c0698o);
        int iA = c0698o.g(this) ? j.a(2, 3) : j.a(1, 3);
        Object obj4 = this.f16413t;
        j.c(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        y.b(5, obj4);
        Object objA = ((h) obj4).a(obj, obj2, obj3, c0698o, Integer.valueOf(iA | i10));
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0563h(this, obj, obj2, obj3, i10);
        }
        return objA;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4, C0698o c0698o, int i10) {
        c0698o.V(this.f16411r);
        j(c0698o);
        int iA = c0698o.g(this) ? j.a(2, 4) : j.a(1, 4);
        Object obj5 = this.f16413t;
        j.c(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        y.b(6, obj5);
        Object objK = ((i) obj5).k(obj, obj2, obj3, obj4, c0698o, Integer.valueOf(iA | i10));
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new c(this, obj, obj2, obj3, obj4, i10);
        }
        return objK;
    }

    @Override // p241y9.g
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        return f(obj, obj2, (C0698o) obj3, ((Number) obj4).intValue());
    }

    @Override // p241y9.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b(((Number) obj2).intValue(), (C0698o) obj);
    }

    public final void j(C0698o c0698o) {
        C0699o0 c0699o0V;
        if (!this.f16412s || (c0699o0V = c0698o.v()) == null) {
            return;
        }
        c0698o.getClass();
        c0699o0V.f10746a |= 1;
        if (j.e(this.f16414u, c0699o0V)) {
            this.f16414u = c0699o0V;
            return;
        }
        ArrayList arrayList = this.f16415v;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f16415v = arrayList2;
            arrayList2.add(c0699o0V);
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (j.e((C0699o0) arrayList.get(i10), c0699o0V)) {
                arrayList.set(i10, c0699o0V);
                return;
            }
        }
        arrayList.add(c0699o0V);
    }

    @Override // p241y9.i
    public final /* bridge */ /* synthetic */ Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Serializable serializable) {
        return h(obj, obj2, obj3, obj4, (C0698o) obj5, ((Number) serializable).intValue());
    }
}
