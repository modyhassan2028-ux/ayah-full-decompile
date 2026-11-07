package p034d2;

import U6.C0532j;
import android.support.v4.media.session.r;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class e implements KeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyListener f15563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0532j f15564b;

    public e(KeyListener keyListener) {
        C0532j c0532j = new C0532j(25);
        this.f15563a = keyListener;
        this.f15564b = c0532j;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f15563a.clearMetaKeyState(view, editable, i10);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f15563a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        this.f15564b.getClass();
        if (i10 != 67) {
            z10 = i10 != 112 ? false : r.z(editable, keyEvent, true);
        } else {
            z10 = r.z(editable, keyEvent, false);
        }
        if (z10) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z11 = true;
        } else {
            z11 = false;
        }
        return z11 || this.f15563a.onKeyDown(view, editable, i10, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f15563a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f15563a.onKeyUp(view, editable, i10, keyEvent);
    }
}
