package p034d2;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import p013b2.j;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f15561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f15562b;

    public d(TextView textView) {
        this.f15561a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        TextView textView = this.f15561a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iC = j.a().c();
        if (iC != 0) {
            if (iC == 1) {
                if ((i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return j.a().g(0, charSequence.length(), 0, charSequence);
            }
            if (iC != 3) {
                return charSequence;
            }
        }
        j jVarA = j.a();
        if (this.f15562b == null) {
            this.f15562b = new c(textView, this);
        }
        jVarA.h(this.f15562b);
        return charSequence;
    }
}
