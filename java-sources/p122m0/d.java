package p122m0;

import J0.I;
import N0.a;
import R0.i;
import R0.j;
import R0.k;
import R0.q;
import W2.n;
import android.graphics.Rect;
import android.support.v4.media.session.p;
import android.util.Log;
import android.util.SparseArray;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.platform.AndroidComposeView;
import p162q0.h;
import p241y9.c;
import u.u;

/* JADX INFO: loaded from: classes.dex */
public final class d extends k implements k, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f19462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f19463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AndroidComposeView f19464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S0.a f19465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f19467f = new Rect();
    public final AutofillId g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f19468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19469i;

    public d(a aVar, q qVar, AndroidComposeView androidComposeView, S0.a aVar2, String str) {
        this.f19462a = aVar;
        this.f19463b = qVar;
        this.f19464c = androidComposeView;
        this.f19465d = aVar2;
        this.f19466e = str;
        androidComposeView.setImportantForAutofill(1);
        a aVarZ = Y2.a.z(androidComposeView);
        AutofillId autofillId = aVarZ != null ? (AutofillId) aVarZ.f5961a : null;
        if (autofillId == null) {
            throw p.s("Required value was null.");
        }
        this.g = autofillId;
        this.f19468h = new u();
    }

    public final void a(SparseArray sparseArray) {
        j jVarW;
        c cVar;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            AutofillValue autofillValueG = n.g(sparseArray.get(iKeyAt));
            if (autofillValueG.isText()) {
                I i11 = (I) this.f19463b.f7124c.b(iKeyAt);
                if (i11 != null && (jVarW = i11.w()) != null) {
                    Object objG = jVarW.f7108r.g(i.g);
                    if (objG == null) {
                        objG = null;
                    }
                    R0.a aVar = (R0.a) objG;
                    if (aVar != null && (cVar = (c) aVar.f7069b) != null) {
                    }
                }
            } else if (autofillValueG.isDate()) {
                Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
            } else if (autofillValueG.isList()) {
                Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
            } else if (autofillValueG.isToggle()) {
                Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
            }
        }
    }
}
