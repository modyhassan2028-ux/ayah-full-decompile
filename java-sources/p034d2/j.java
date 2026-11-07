package p034d2;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class j implements TransformationMethod {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TransformationMethod f15573r;

    public j(TransformationMethod transformationMethod) {
        this.f15573r = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f15573r;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || p013b2.j.a().c() != 1) {
            return charSequence;
        }
        p013b2.j jVarA = p013b2.j.a();
        jVarA.getClass();
        return jVarA.g(0, charSequence.length(), 0, charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.f15573r;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i10, rect);
        }
    }
}
