package H7;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f3443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3444d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f3446f;
    public N7.e g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f3441a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f3442b = new C(0, this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3445e = true;

    public E(D d5) {
        this.f3446f = new WeakReference(null);
        this.f3446f = new WeakReference(d5);
    }

    public final float a(String str) {
        if (!this.f3445e) {
            return this.f3443c;
        }
        b(str);
        return this.f3443c;
    }

    public final void b(String str) {
        TextPaint textPaint = this.f3441a;
        this.f3443c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f3444d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f3445e = false;
    }

    public final void c(N7.e eVar, Context context) {
        if (this.g != eVar) {
            this.g = eVar;
            if (eVar != null) {
                TextPaint textPaint = this.f3441a;
                C c10 = this.f3442b;
                eVar.f(context, textPaint, c10);
                D d5 = (D) this.f3446f.get();
                if (d5 != null) {
                    textPaint.drawableState = d5.getState();
                }
                eVar.e(context, textPaint, c10);
                this.f3445e = true;
            }
            D d9 = (D) this.f3446f.get();
            if (d9 != null) {
                d9.a();
                d9.onStateChange(d9.getState());
            }
        }
    }
}
