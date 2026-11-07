package N0;

import J1.c;
import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f5963b;

    public b(ContentCaptureSession contentCaptureSession, View view) {
        this.f5962a = contentCaptureSession;
        this.f5963b = view;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionF = c.f(this.f5962a);
            a aVarZ = Y2.a.z(this.f5963b);
            Objects.requireNonNull(aVarZ);
            contentCaptureSessionF.notifyViewsDisappeared(c.d(aVarZ.f5961a), new long[]{Long.MIN_VALUE});
        }
    }

    public final AutofillId b(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionF = c.f(this.f5962a);
        a aVarZ = Y2.a.z(this.f5963b);
        Objects.requireNonNull(aVarZ);
        return contentCaptureSessionF.newAutofillId(c.d(aVarZ.f5961a), j);
    }

    public final O8.c c(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new O8.c(c.f(this.f5962a).newVirtualViewStructure(autofillId, j));
        }
        return null;
    }

    public final void d(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.f(this.f5962a).notifyViewAppeared(viewStructure);
        }
    }

    public final void e(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.f(this.f5962a).notifyViewDisappeared(autofillId);
        }
    }

    public final void f(AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            ((ContentCaptureSession) this.f5962a).notifyViewTextChanged(autofillId, str);
        }
    }
}
