package androidx.appcompat.widget;

import E2.C0112b;
import I1.C0249e;
import I1.C0253g;
import I1.C0256i;
import I1.InterfaceC0251f;
import I1.InterfaceC0265s;
import I1.S;
import K1.e;
import N1.k;
import N1.m;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.ayah.R;
import p017b7.g;
import p151p.A;
import p151p.B;
import p151p.C1275x;
import p151p.L;
import p151p.T;
import p151p.Y0;
import p151p.Z0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements InterfaceC0265s, m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0112b f11512r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final T f11513s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final A f11514t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final k f11515u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final A f11516v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C1275x f11517w;

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    private C1275x getSuperCaller() {
        if (this.f11517w == null) {
            this.f11517w = new C1275x(this);
        }
        return this.f11517w;
    }

    @Override // I1.InterfaceC0265s
    public final C0256i a(C0256i c0256i) {
        this.f11515u.getClass();
        return k.a(this, c0256i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0112b c0112b = this.f11512r;
        if (c0112b != null) {
            c0112b.a();
        }
        T t2 = this.f11513s;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g.u0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0112b c0112b = this.f11512r;
        if (c0112b != null) {
            return c0112b.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0112b c0112b = this.f11512r;
        if (c0112b != null) {
            return c0112b.j();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f11513s.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f11513s.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        A a9;
        if (Build.VERSION.SDK_INT >= 28 || (a9 = this.f11514t) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) a9.f20507c;
        return textClassifier == null ? L.a((TextView) a9.f20506b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrG;
        InputConnection eVar;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f11513s.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 && inputConnectionOnCreateInputConnection != null) {
            K1.c.c(editorInfo, getText());
        }
        p000a.a.S(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i10 <= 30 && (strArrG = S.g(this)) != null) {
            K1.c.b(editorInfo, strArrG);
            C6.b bVar = new C6.b(3, this);
            if (i10 >= 25) {
                eVar = new K1.d(inputConnectionOnCreateInputConnection, bVar);
            } else if (K1.c.a(editorInfo).length != 0) {
                eVar = new e(inputConnectionOnCreateInputConnection, bVar);
            }
            inputConnectionOnCreateInputConnection = eVar;
        }
        return this.f11516v.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i10 = Build.VERSION.SDK_INT;
        boolean zA = false;
        if (i10 < 31 && i10 >= 24 && dragEvent.getLocalState() == null && S.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = B.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        C0253g c0253g;
        InterfaceC0251f interfaceC0251f;
        int i11;
        C0249e c0249e;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 || S.g(this) == null || !(i10 == 16908322 || i10 == 16908337)) {
            return super.onTextContextMenuItem(i10);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i12 >= 31) {
                c0249e = new C0249e(primaryClip, 1);
            } else {
                c0253g = new C0253g();
                c0253g.f3733b = primaryClip;
                c0253g.f3734c = 1;
            }
            if (i10 == 16908322) {
                interfaceC0251f = c0253g;
                interfaceC0251f = c0249e;
                i11 = 0;
            } else {
                interfaceC0251f = c0253g;
                interfaceC0251f = c0249e;
                i11 = 1;
            }
            interfaceC0251f.b(i11);
            S.k(this, interfaceC0251f.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0112b c0112b = this.f11512r;
        if (c0112b != null) {
            c0112b.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0112b c0112b = this.f11512r;
        if (c0112b != null) {
            c0112b.p(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f11513s;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        T t2 = this.f11513s;
        if (t2 != null) {
            t2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.v0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f11516v.d(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f11516v.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0112b c0112b = this.f11512r;
        if (c0112b != null) {
            c0112b.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0112b c0112b = this.f11512r;
        if (c0112b != null) {
            c0112b.v(mode);
        }
    }

    @Override // N1.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        T t2 = this.f11513s;
        t2.k(colorStateList);
        t2.b();
    }

    @Override // N1.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        T t2 = this.f11513s;
        t2.l(mode);
        t2.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        T t2 = this.f11513s;
        if (t2 != null) {
            t2.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        A a9;
        if (Build.VERSION.SDK_INT >= 28 || (a9 = this.f11514t) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            a9.f20507c = textClassifier;
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Z0.a(context);
        Y0.a(this, getContext());
        C0112b c0112b = new C0112b(this);
        this.f11512r = c0112b;
        c0112b.l(attributeSet, i10);
        T t2 = new T(this);
        this.f11513s = t2;
        t2.f(attributeSet, i10);
        t2.b();
        A a9 = new A();
        a9.f20506b = this;
        this.f11514t = a9;
        this.f11515u = new k();
        A a10 = new A(this);
        this.f11516v = a10;
        a10.b(attributeSet, i10);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = a10.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }
}
