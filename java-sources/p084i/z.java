package p084i;

import F2.y;
import I1.InterfaceC0260m;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.ayah.R;
import p020c.k;
import p050e8.b;

/* JADX INFO: loaded from: classes.dex */
public class z extends k implements InterfaceC0960h {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public x f16697u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y f16698v;

    /* JADX WARN: Type inference failed for: r2v2, types: [i.y] */
    public z(Context context, int i10) {
        int i11;
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i11 = typedValue.resourceId;
        } else {
            i11 = i10;
        }
        super(context, i11);
        this.f16698v = new InterfaceC0260m() { // from class: i.y
            @Override // I1.InterfaceC0260m
            public final boolean d(KeyEvent keyEvent) {
                return this.f16696r.f(keyEvent);
            }
        };
        k kVarE = e();
        if (i10 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i10 = typedValue2.resourceId;
        }
        ((x) kVarE).f16682k0 = i10;
        kVarE.d();
    }

    @Override // p020c.k, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        x xVar = (x) e();
        xVar.w();
        ((ViewGroup) xVar.R.findViewById(android.R.id.content)).addView(view, layoutParams);
        xVar.f16654D.a(xVar.f16653C.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        e().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return b.q(this.f16698v, getWindow().getDecorView(), this, keyEvent);
    }

    public final k e() {
        if (this.f16697u == null) {
            y yVar = k.f16608r;
            this.f16697u = new x(getContext(), getWindow(), this, this);
        }
        return this.f16697u;
    }

    public final boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i10) {
        x xVar = (x) e();
        xVar.w();
        return xVar.f16653C.findViewById(i10);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        e().b();
    }

    @Override // p020c.k, android.app.Dialog
    public void onCreate(Bundle bundle) {
        e().a();
        super.onCreate(bundle);
        e().d();
    }

    @Override // p020c.k, android.app.Dialog
    public final void onStop() {
        super.onStop();
        x xVar = (x) e();
        xVar.C();
        b bVar = xVar.f16656F;
        if (bVar != null) {
            bVar.a0(false);
        }
    }

    @Override // p020c.k, android.app.Dialog
    public void setContentView(int i10) {
        d();
        e().h(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().l(charSequence);
    }

    @Override // p020c.k, android.app.Dialog
    public void setContentView(View view) {
        d();
        e().i(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i10) {
        super.setTitle(i10);
        e().l(getContext().getString(i10));
    }

    @Override // p020c.k, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        e().j(view, layoutParams);
    }
}
