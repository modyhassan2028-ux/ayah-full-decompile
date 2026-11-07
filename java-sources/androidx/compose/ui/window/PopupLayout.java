package androidx.compose.ui.window;

import H0.InterfaceC0219s;
import J7.c;
import K0.d1;
import W.C0557f1;
import Z.C;
import Z.C0672b;
import Z.C0681f0;
import Z.C0698o;
import Z.C0709z;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.lifecycle.K;
import com.ayah.R;
import java.util.UUID;
import p063g1.k;
import p063g1.m;
import p093j0.u;
import p104k1.b;
import p104k1.g;
import p104k1.i;
import p104k1.l;
import p104k1.p;
import p104k1.q;
import p104k1.r;
import p104k1.s;
import p104k1.t;
import p241y9.a;
import p241y9.e;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public final class PopupLayout extends AbstractComposeView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public t f12126A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f12127B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final View f12128C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final r f12129D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final WindowManager f12130E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final WindowManager.LayoutParams f12131F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public s f12132G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public m f12133H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C0681f0 f12134I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C0681f0 f12135J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public k f12136K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final C f12137L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Rect f12138M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final u f12139N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public c f12140O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final C0681f0 f12141P;
    public boolean Q;
    public final int[] R;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public a f12142z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupLayout(a aVar, t tVar, String str, View view, p063g1.c cVar, s sVar, UUID uuid) {
        super(view.getContext(), null, 6, 0);
        r qVar = Build.VERSION.SDK_INT >= 29 ? new q() : new r();
        this.f12142z = aVar;
        this.f12126A = tVar;
        this.f12127B = str;
        this.f12128C = view;
        this.f12129D = qVar;
        Object systemService = view.getContext().getSystemService("window");
        j.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f12130E = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        t tVar2 = this.f12126A;
        boolean zB = i.b(view);
        boolean z10 = tVar2.f18950b;
        int i10 = tVar2.f18949a;
        if (z10 && zB) {
            i10 |= 8192;
        } else if (z10 && !zB) {
            i10 &= -8193;
        }
        layoutParams.flags = i10;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f12131F = layoutParams;
        this.f12132G = sVar;
        this.f12133H = m.f16261r;
        this.f12134I = C0672b.r(null);
        this.f12135J = C0672b.r(null);
        this.f12137L = C0672b.o(new C0557f1(14, this));
        this.f12138M = new Rect();
        this.f12139N = new u(new g(this, 2));
        setId(android.R.id.content);
        K.g(this, K.d(view));
        K.h(this, K.e(view));
        p000a.a.j0(this, p000a.a.H(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(cVar.w((float) 8));
        setOutlineProvider(new d1(2));
        this.f12141P = C0672b.r(l.f18928a);
        this.R = new int[2];
    }

    private final e getContent() {
        return (e) this.f12141P.getValue();
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0219s getParentLayoutCoordinates() {
        return (InterfaceC0219s) this.f12135J.getValue();
    }

    private final k getVisibleDisplayBounds() {
        this.f12129D.getClass();
        View view = this.f12128C;
        Rect rect = this.f12138M;
        view.getWindowVisibleDisplayFrame(rect);
        C0709z c0709z = i.f18923a;
        return new k(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(e eVar) {
        this.f12141P.setValue(eVar);
    }

    private final void setParentLayoutCoordinates(InterfaceC0219s interfaceC0219s) {
        this.f12135J.setValue(interfaceC0219s);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(C0698o c0698o) {
        c0698o.T(-857613600);
        getContent().invoke(c0698o, 0);
        c0698o.p(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f12126A.f18951c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                a aVar = this.f12142z;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void e(boolean z10, int i10, int i11, int i12, int i13) {
        super.e(z10, i10, i11, i12, i13);
        this.f12126A.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.f12131F;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f12129D.getClass();
        this.f12130E.updateViewLayout(this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void f(int i10, int i11) {
        this.f12126A.getClass();
        k visibleDisplayBounds = getVisibleDisplayBounds();
        super.f(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.b(), Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f12137L.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f12131F;
    }

    public final m getParentLayoutDirection() {
        return this.f12133H;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final p063g1.l m3getPopupContentSizebOM6tXw() {
        return (p063g1.l) this.f12134I.getValue();
    }

    public final s getPositionProvider() {
        return this.f12132G;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.Q;
    }

    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.f12127B;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void i(a aVar, t tVar, String str, m mVar) {
        int i10;
        this.f12142z = aVar;
        this.f12127B = str;
        if (!j.a(this.f12126A, tVar)) {
            tVar.getClass();
            this.f12126A = tVar;
            boolean zB = i.b(this.f12128C);
            boolean z10 = tVar.f18950b;
            int i11 = tVar.f18949a;
            if (z10 && zB) {
                i11 |= 8192;
            } else if (z10 && !zB) {
                i11 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.f12131F;
            layoutParams.flags = i11;
            this.f12129D.getClass();
            this.f12130E.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = mVar.ordinal();
        if (iOrdinal != 0) {
            i10 = 1;
            if (iOrdinal != 1) {
                throw new A6.a();
            }
        } else {
            i10 = 0;
        }
        super.setLayoutDirection(i10);
    }

    public final void j() {
        InterfaceC0219s parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.C()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jF = parentLayoutCoordinates.F();
            long jH = parentLayoutCoordinates.h(0L);
            long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jH >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jH & 4294967295L)))) & 4294967295L);
            int i10 = (int) (jRound >> 32);
            int i11 = (int) (jRound & 4294967295L);
            k kVar = new k(i10, i11, ((int) (jF >> 32)) + i10, ((int) (jF & 4294967295L)) + i11);
            if (kVar.equals(this.f12136K)) {
                return;
            }
            this.f12136K = kVar;
            l();
        }
    }

    public final void k(InterfaceC0219s interfaceC0219s) {
        setParentLayoutCoordinates(interfaceC0219s);
        j();
    }

    public final void l() {
        p063g1.l lVarM3getPopupContentSizebOM6tXw;
        k kVar = this.f12136K;
        if (kVar == null || (lVarM3getPopupContentSizebOM6tXw = m3getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = lVarM3getPopupContentSizebOM6tXw.f16260a;
        k visibleDisplayBounds = getVisibleDisplayBounds();
        long jB = (((long) visibleDisplayBounds.b()) & 4294967295L) | (((long) visibleDisplayBounds.d()) << 32);
        p251z9.u uVar = new p251z9.u();
        uVar.f24885r = 0L;
        this.f12139N.d(this, b.f18901x, new p(uVar, this, kVar, jB, j));
        long j10 = uVar.f24885r;
        WindowManager.LayoutParams layoutParams = this.f12131F;
        layoutParams.x = (int) (j10 >> 32);
        layoutParams.y = (int) (j10 & 4294967295L);
        boolean z10 = this.f12126A.f18953e;
        r rVar = this.f12129D;
        if (z10) {
            rVar.a(this, (int) (jB >> 32), (int) (jB & 4294967295L));
        }
        rVar.getClass();
        this.f12130E.updateViewLayout(this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12139N.e();
        if (!this.f12126A.f18951c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f12140O == null) {
            this.f12140O = new c(3, this.f12142z);
        }
        E1.a.f(this, this.f12140O);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u uVar = this.f12139N;
        C6.b bVar = uVar.f18692h;
        if (bVar != null) {
            bVar.h();
        }
        uVar.b();
        if (Build.VERSION.SDK_INT >= 33) {
            E1.a.g(this, this.f12140O);
        }
        this.f12140O = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f12126A.f18952d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            a aVar = this.f12142z;
            if (aVar != null) {
                aVar.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            a aVar2 = this.f12142z;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }

    public final void setParentLayoutDirection(m mVar) {
        this.f12133H = mVar;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m4setPopupContentSizefhxjrPA(p063g1.l lVar) {
        this.f12134I.setValue(lVar);
    }

    public final void setPositionProvider(s sVar) {
        this.f12132G = sVar;
    }

    public final void setTestTag(String str) {
        this.f12127B = str;
    }

    public final void setContent(Z.r rVar, e eVar) {
        setParentCompositionContext(rVar);
        setContent(eVar);
        this.Q = true;
    }
}
