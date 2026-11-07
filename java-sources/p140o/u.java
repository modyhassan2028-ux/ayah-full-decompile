package p140o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.ayah.R;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f20198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f20201e;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v f20203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s f20204i;
    public PopupWindow.OnDismissListener j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20202f = 8388611;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f20205k = new t(this);

    public u(Context context, k kVar, View view, boolean z10, int i10, int i11) {
        this.f20197a = context;
        this.f20198b = kVar;
        this.f20201e = view;
        this.f20199c = z10;
        this.f20200d = i10;
    }

    public final s a() {
        s b5;
        if (this.f20204i == null) {
            Context context = this.f20197a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                b5 = new e(context, this.f20201e, this.f20200d, this.f20199c);
            } else {
                b5 = new B(this.f20197a, this.f20198b, this.f20201e, this.f20200d, this.f20199c);
            }
            b5.n(this.f20198b);
            b5.t(this.f20205k);
            b5.p(this.f20201e);
            b5.h(this.f20203h);
            b5.q(this.g);
            b5.r(this.f20202f);
            this.f20204i = b5;
        }
        return this.f20204i;
    }

    public final boolean b() {
        s sVar = this.f20204i;
        return sVar != null && sVar.a();
    }

    public void c() {
        this.f20204i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        s sVarA = a();
        sVarA.u(z11);
        if (z10) {
            if ((Gravity.getAbsoluteGravity(this.f20202f, this.f20201e.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f20201e.getWidth();
            }
            sVarA.s(i10);
            sVarA.v(i11);
            int i12 = (int) ((this.f20197a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            sVarA.f20195r = new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        }
        sVarA.d();
    }
}
