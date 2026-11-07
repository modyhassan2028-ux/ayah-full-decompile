package p232y;

import A.EnumC0047u0;
import N7.f;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import p063g1.l;

/* JADX INFO: renamed from: y.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1470y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f24600c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EdgeEffect f24601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EdgeEffect f24602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EdgeEffect f24603f;
    public EdgeEffect g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EdgeEffect f24604h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EdgeEffect f24605i;
    public EdgeEffect j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EdgeEffect f24606k;

    public C1470y(Context context, int i10) {
        this.f24598a = context;
        this.f24599b = i10;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? f.d(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a(EnumC0047u0 enumC0047u0) {
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f24598a;
        EdgeEffect edgeEffectB = i10 >= 31 ? f.b(context) : new B(context);
        edgeEffectB.setColor(this.f24599b);
        if (!l.a(this.f24600c, 0L)) {
            if (enumC0047u0 == EnumC0047u0.f424r) {
                long j = this.f24600c;
                edgeEffectB.setSize((int) (j >> 32), (int) (4294967295L & j));
                return edgeEffectB;
            }
            long j10 = this.f24600c;
            edgeEffectB.setSize((int) (4294967295L & j10), (int) (j10 >> 32));
        }
        return edgeEffectB;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f24602e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(EnumC0047u0.f424r);
        this.f24602e = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f24603f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(EnumC0047u0.f425s);
        this.f24603f = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(EnumC0047u0.f425s);
        this.g = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f24601d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(EnumC0047u0.f424r);
        this.f24601d = edgeEffectA;
        return edgeEffectA;
    }
}
