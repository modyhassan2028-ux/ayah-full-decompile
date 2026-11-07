package p173r2;

import G9.k;
import G9.m;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.p;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.Arrays;
import p013b2.n;
import p020c.E;
import p110k9.a;
import p197u2.h;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f21412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f21413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Activity f21414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final E f21416f;
    public final boolean g;

    public A(Context context) {
        j.e(context, "context");
        this.f21411a = context;
        this.f21412b = new h(this, new l(this, 0));
        this.f21413c = new n(context, 2);
        for (Object obj : k.b0(context, new m(21))) {
            if (((Context) obj) instanceof Activity) {
                this.f21414d = (Activity) obj;
                this.f21416f = new E(2, this);
                this.g = true;
                H h7 = this.f21412b.f22865s;
                h7.a(new z(h7));
                this.f21412b.f22865s.a(new C1282b(this.f21411a));
                a.d(new l(this, 1));
            }
        }
        obj = null;
        this.f21414d = (Activity) obj;
        this.f21416f = new E(2, this);
        this.g = true;
        H h10 = this.f21412b.f22865s;
        h10.a(new z(h10));
        this.f21412b.f22865s.a(new C1282b(this.f21411a));
        a.d(new l(this, 1));
    }

    public static void a(A a9, String str) {
        a9.getClass();
        j.e(str, "route");
        h hVar = a9.f21412b;
        hVar.getClass();
        if (hVar.f22851c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + str + ". Navigation graph has not been set for NavController " + hVar + '.').toString());
        }
        x xVarJ = hVar.j();
        u uVarF = xVarJ.f(str, true, xVarJ);
        if (uVarF == null) {
            StringBuilder sbD = p.D("Navigation destination that matches route ", str, " cannot be found in the navigation graph ");
            sbD.append(hVar.f22851c);
            throw new IllegalArgumentException(sbD.toString());
        }
        v vVar = uVarF.f21486r;
        Bundle bundleB = vVar.b(uVarF.f21487s);
        if (bundleB == null) {
            bundleB = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
        }
        int i10 = v.f21491v;
        String str2 = (String) vVar.f21493s.f1645e;
        String strConcat = str2 != null ? "android-app://androidx.navigation/".concat(str2) : "";
        j.e(strConcat, "uriString");
        Uri uri = Uri.parse(strConcat);
        j.d(uri, "parse(...)");
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleB.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        hVar.l(vVar, bundleB, null);
    }

    public final void b() {
        h hVar = this.f21412b;
        if (hVar.f22854f.isEmpty()) {
            return;
        }
        v vVarG = hVar.g();
        j.b(vVarG);
        if (hVar.m(vVarG.f21493s.f1641a, true, false)) {
            hVar.b();
        }
    }
}
