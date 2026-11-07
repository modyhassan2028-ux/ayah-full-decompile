package I1;

import K9.AbstractC0405x;
import Z.C0672b;
import android.content.ClipData;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.ScrollCaptureTarget;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.function.Consumer;

/* JADX INFO: renamed from: I1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0249e implements InterfaceC0251f, InterfaceC0255h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3724b;

    public C0249e() {
        this.f3723a = 2;
        this.f3724b = C0672b.r(Boolean.FALSE);
    }

    @Override // I1.InterfaceC0251f
    public void a(Uri uri) {
        ((ContentInfo.Builder) this.f3724b).setLinkUri(uri);
    }

    @Override // I1.InterfaceC0251f
    public void b(int i10) {
        ((ContentInfo.Builder) this.f3724b).setFlags(i10);
    }

    @Override // I1.InterfaceC0251f
    public C0256i build() {
        return new C0256i(new C0249e(((ContentInfo.Builder) this.f3724b).build()));
    }

    public void c(AndroidComposeView androidComposeView, R0.q qVar, p150o9.h hVar, Consumer consumer) {
        p011b0.e eVar = new p011b0.e(new Q0.i[16]);
        p050e8.b.d0(qVar.a(), 0, new Q0.h(1, 8, p011b0.e.class, eVar, "add", "add(Ljava/lang/Object;)Z"));
        eVar.o(new K0.F(1, new p241y9.c[]{Q0.b.f6826t, Q0.b.f6827u}));
        int i10 = eVar.f13127t;
        Q0.i iVar = (Q0.i) (i10 == 0 ? null : eVar.f13125r[i10 - 1]);
        if (iVar == null) {
            return;
        }
        p063g1.k kVar = iVar.f6849c;
        Q0.d dVar = new Q0.d(iVar.f6847a, kVar, AbstractC0405x.b(hVar), this, androidComposeView);
        J0.j0 j0Var = iVar.f6850d;
        p171r0.e eVarJ = H0.a0.d(j0Var).J(j0Var, true);
        long jC = kVar.c();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(androidComposeView, p180s0.F.r(B0.c.b0(eVarJ)), new Point((int) (jC >> 32), (int) (jC & 4294967295L)), dVar);
        scrollCaptureTarget.setScrollBounds(p180s0.F.r(kVar));
        consumer.accept(scrollCaptureTarget);
    }

    @Override // I1.InterfaceC0255h
    public int e() {
        return ((ContentInfo) this.f3724b).getFlags();
    }

    @Override // I1.InterfaceC0255h
    public ClipData f() {
        return ((ContentInfo) this.f3724b).getClip();
    }

    @Override // I1.InterfaceC0255h
    public ContentInfo g() {
        return (ContentInfo) this.f3724b;
    }

    @Override // I1.InterfaceC0255h
    public int h() {
        return ((ContentInfo) this.f3724b).getSource();
    }

    @Override // I1.InterfaceC0251f
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f3724b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f3723a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.f3724b) + "}";
            default:
                return super.toString();
        }
    }

    public C0249e(ContentInfo contentInfo) {
        this.f3723a = 1;
        contentInfo.getClass();
        this.f3724b = contentInfo;
    }

    public C0249e(ClipData clipData, int i10) {
        this.f3723a = 0;
        this.f3724b = AbstractC0247d.a(clipData, i10);
    }
}
