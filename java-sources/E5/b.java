package E5;

import K9.AbstractC0405x;
import X7.t;
import android.app.Dialog;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.ayah.R;
import com.ayah.feature.picker.book.view.ChooseBookPage;
import com.ayah.feature.reciterlist.RecitersActivity;
import com.ayah.share.ShareActivity;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.google.android.material.datepicker.MaterialDatePicker;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1892r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1893s;

    public /* synthetic */ b(int i10, Object obj) {
        this.f1892r = i10;
        this.f1893s = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC0813f2 abstractC0813f2;
        int i10 = this.f1892r;
        p150o9.c cVar = null;
        Object obj = this.f1893s;
        switch (i10) {
            case 0:
                ChooseBookPage chooseBookPage = (ChooseBookPage) obj;
                Dialog dialog = chooseBookPage.f12590z0;
                if (dialog instanceof p193t7.e) {
                    p193t7.e eVar = (p193t7.e) dialog;
                    if (eVar.f22638w == null) {
                        eVar.g();
                    }
                    boolean z10 = eVar.f22638w.f14671Z;
                }
                chooseBookPage.S(false, false);
                return;
            case 1:
                int i11 = RecitersActivity.f13853Z;
                ((RecitersActivity) obj).finish();
                return;
            case 2:
                J5.a aVar = (J5.a) obj;
                RecyclerView recyclerView = aVar.f4329v;
                Object parent = view.getParent();
                j.c(parent, "null cannot be cast to non-null type android.view.View");
                recyclerView.getClass();
                Object obj2 = aVar.f4333z.get(RecyclerView.N((View) parent));
                j.c(obj2, "null cannot be cast to non-null type com.ayah.feature.reciterlist.model.ReciterRow.Reciter");
                aVar.f4331x.e(((K5.b) obj2).f5243a);
                return;
            case 3:
                X7.d dVar = (X7.d) obj;
                EditText editText = dVar.f10002i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                dVar.p();
                return;
            case 4:
                ((X7.j) obj).t();
                return;
            case 5:
                t tVar = (t) obj;
                EditText editText2 = tVar.f10088f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = tVar.f10088f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    tVar.f10088f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    tVar.f10088f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    tVar.f10088f.setSelection(selectionEnd);
                }
                tVar.p();
                return;
            case 6:
                ((MaterialDatePicker) obj).W();
                throw null;
            case 7:
                ShareActivity shareActivity = (ShareActivity) obj;
                RadioGroup radioGroup = shareActivity.f13922X;
                if (radioGroup == null) {
                    j.k("formatGroup");
                    throw null;
                }
                int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                if (checkedRadioButtonId == R.id.text_button) {
                    SwitchCompat switchCompat = shareActivity.f13923Y;
                    if (switchCompat != null) {
                        shareActivity.t(false, switchCompat.isChecked());
                        return;
                    } else {
                        j.k("addBadgeSwitch");
                        throw null;
                    }
                }
                int i12 = 1;
                if (checkedRadioButtonId != R.id.text_with_diacritics_button) {
                    AbstractC0405x.x(shareActivity.f13921W, null, new p127m6.c(shareActivity, cVar, i12), 3);
                    return;
                }
                SwitchCompat switchCompat2 = shareActivity.f13923Y;
                if (switchCompat2 != null) {
                    shareActivity.t(true, switchCompat2.isChecked());
                    return;
                } else {
                    j.k("addBadgeSwitch");
                    throw null;
                }
            default:
                p168q6.d dVar2 = (p168q6.d) obj;
                int iIntValue = ((Number) dVar2.f21326x.e(view)).intValue();
                if (iIntValue < 0 || (abstractC0813f2 = ((p156p4.a) dVar2.f21328z.get(iIntValue)).f20983a) == null) {
                    return;
                }
                p124m3.j jVarG = abstractC0813f2.G();
                dVar2.f21325w.invoke(Integer.valueOf(jVarG.c()), Integer.valueOf(jVarG.f19585a));
                return;
        }
    }
}
