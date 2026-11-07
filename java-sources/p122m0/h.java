package p122m0;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static AutofillValue a(String str) {
        return AutofillValue.forText(str);
    }

    public static void b(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public static void c(ViewStructure viewStructure, AutofillId autofillId, int i10) {
        viewStructure.setAutofillId(autofillId, i10);
    }

    public static void d(ViewStructure viewStructure, int i10) {
        viewStructure.setAutofillType(i10);
    }

    public static void e(ViewStructure viewStructure, AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }

    public static void f(ViewStructure viewStructure) {
        viewStructure.setDataIsSensitive(true);
    }

    public static void g(ViewStructure viewStructure) {
        viewStructure.setInputType(129);
    }
}
