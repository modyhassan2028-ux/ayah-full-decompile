package p034d2;

import B0.c;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import p013b2.j;

/* JADX INFO: loaded from: classes.dex */
public final class g extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f15568d;

    public g(TextView textView) {
        this.f15568d = new f(textView);
    }

    @Override // B0.c
    public final InputFilter[] F(InputFilter[] inputFilterArr) {
        return !j.d() ? inputFilterArr : this.f15568d.F(inputFilterArr);
    }

    @Override // B0.c
    public final boolean R() {
        return this.f15568d.f15567f;
    }

    @Override // B0.c
    public final void c0(boolean z10) {
        if (j.d()) {
            this.f15568d.c0(z10);
        }
    }

    @Override // B0.c
    public final void e0(boolean z10) {
        boolean zD = j.d();
        f fVar = this.f15568d;
        if (zD) {
            fVar.e0(z10);
        } else {
            fVar.f15567f = z10;
        }
    }

    @Override // B0.c
    public final TransformationMethod l0(TransformationMethod transformationMethod) {
        return !j.d() ? transformationMethod : this.f15568d.l0(transformationMethod);
    }
}
