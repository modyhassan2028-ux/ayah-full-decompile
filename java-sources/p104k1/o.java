package p104k1;

import K0.d1;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.K;
import com.ayah.R;
import java.util.UUID;
import p020c.D;
import p020c.E;
import p020c.k;
import p063g1.c;
import p063g1.m;
import p241y9.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class o extends k {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a f18940u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n f18941v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final View f18942w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final m f18943x;

    public o(a aVar, n nVar, View view, m mVar, c cVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), nVar.f18939e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.f18940u = aVar;
        this.f18941v = nVar;
        this.f18942w = view;
        float f3 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        B0.c.d0(window, this.f18941v.f18939e);
        window.setGravity(17);
        m mVar2 = new m(getContext(), window);
        mVar2.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        mVar2.setClipChildren(false);
        mVar2.setElevation(cVar.w(f3));
        mVar2.setOutlineProvider(new d1(1));
        this.f18943x = mVar2;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            e(viewGroup);
        }
        setContentView(mVar2);
        K.g(mVar2, K.d(view));
        K.h(mVar2, K.e(view));
        p000a.a.j0(mVar2, p000a.a.H(view));
        f(this.f18940u, this.f18941v, mVar);
        D d5 = this.f13393t;
        a aVar2 = new a(this, 1);
        j.e(d5, "<this>");
        d5.a(this, new E(aVar2));
    }

    public static final void e(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof m) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                e(viewGroup2);
            }
        }
    }

    public final void f(a aVar, n nVar, m mVar) {
        int i10;
        this.f18940u = aVar;
        this.f18941v = nVar;
        u uVar = nVar.f18937c;
        boolean zB = i.b(this.f18942w);
        int iOrdinal = uVar.ordinal();
        int i11 = 0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zB = true;
            } else {
                if (iOrdinal != 2) {
                    throw new A6.a();
                }
                zB = false;
            }
        }
        Window window = getWindow();
        j.b(window);
        window.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal2 = mVar.ordinal();
        if (iOrdinal2 == 0) {
            i10 = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new A6.a();
            }
            i10 = 1;
        }
        m mVar2 = this.f18943x;
        mVar2.setLayoutDirection(i10);
        boolean z10 = nVar.f18939e;
        boolean z11 = nVar.f18938d;
        Window window2 = mVar2.f18934z;
        boolean z12 = (mVar2.f18932D && z11 == mVar2.f18930B && z10 == mVar2.f18931C) ? false : true;
        mVar2.f18930B = z11;
        mVar2.f18931C = z10;
        if (z12) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i12 = z11 ? -2 : -1;
            if (i12 != attributes.width || !mVar2.f18932D) {
                window2.setLayout(i12, -2);
                mVar2.f18932D = true;
            }
        }
        setCanceledOnTouchOutside(nVar.f18936b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z10) {
                i11 = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window3.setSoftInputMode(i11);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (!this.f18941v.f18935a || !keyEvent.isTracking() || keyEvent.isCanceled() || i10 != 111) {
            return super.onKeyUp(i10, keyEvent);
        }
        this.f18940u.invoke();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r7 <= r1) goto L24;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            boolean r0 = super.onTouchEvent(r7)
            k1.n r1 = r6.f18941v
            boolean r1 = r1.f18936b
            if (r1 == 0) goto L73
            k1.m r1 = r6.f18943x
            r1.getClass()
            float r2 = r7.getX()
            boolean r3 = java.lang.Float.isInfinite(r2)
            if (r3 != 0) goto L6c
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L6c
            float r2 = r7.getY()
            boolean r3 = java.lang.Float.isInfinite(r2)
            if (r3 != 0) goto L6c
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L6c
            r2 = 0
            android.view.View r2 = r1.getChildAt(r2)
            if (r2 != 0) goto L37
            goto L6c
        L37:
            int r3 = r1.getLeft()
            int r4 = r2.getLeft()
            int r4 = r4 + r3
            int r3 = r2.getWidth()
            int r3 = r3 + r4
            int r1 = r1.getTop()
            int r5 = r2.getTop()
            int r5 = r5 + r1
            int r1 = r2.getHeight()
            int r1 = r1 + r5
            float r2 = r7.getX()
            int r2 = B9.a.V(r2)
            if (r4 > r2) goto L6c
            if (r2 > r3) goto L6c
            float r7 = r7.getY()
            int r7 = B9.a.V(r7)
            if (r5 > r7) goto L6c
            if (r7 > r1) goto L6c
            goto L73
        L6c:
            y9.a r7 = r6.f18940u
            r7.invoke()
            r7 = 1
            return r7
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p104k1.o.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
