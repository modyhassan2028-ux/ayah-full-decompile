package p034d2;

import B0.c;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class f extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f15565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f15566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15567f = true;

    public f(TextView textView) {
        this.f15565d = textView;
        this.f15566e = new d(textView);
    }

    @Override // B0.c
    public final InputFilter[] F(InputFilter[] inputFilterArr) {
        if (!this.f15567f) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (sparseArray.indexOfKey(i12) < 0) {
                    inputFilterArr2[i11] = inputFilterArr[i12];
                    i11++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i13 = 0;
        while (true) {
            d dVar = this.f15566e;
            if (i13 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i13] == dVar) {
                return inputFilterArr;
            }
            i13++;
        }
    }

    @Override // B0.c
    public final boolean R() {
        return this.f15567f;
    }

    @Override // B0.c
    public final void c0(boolean z10) {
        if (z10) {
            TextView textView = this.f15565d;
            textView.setTransformationMethod(l0(textView.getTransformationMethod()));
        }
    }

    @Override // B0.c
    public final void e0(boolean z10) {
        this.f15567f = z10;
        TextView textView = this.f15565d;
        textView.setTransformationMethod(l0(textView.getTransformationMethod()));
        textView.setFilters(F(textView.getFilters()));
    }

    @Override // B0.c
    public final TransformationMethod l0(TransformationMethod transformationMethod) {
        if (this.f15567f) {
            return ((transformationMethod instanceof j) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new j(transformationMethod);
        }
        return transformationMethod instanceof j ? ((j) transformationMethod).f15573r : transformationMethod;
    }
}
