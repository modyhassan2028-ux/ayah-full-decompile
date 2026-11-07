package W0;

import android.text.TextPaint;
import com.google.android.gms.internal.measurement.AbstractC0813f2;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0813f2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CharSequence f9486s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextPaint f9487t;

    public b(CharSequence charSequence, TextPaint textPaint) {
        this.f9486s = charSequence;
        this.f9487t = textPaint;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0813f2
    public final int N(int i10) {
        CharSequence charSequence = this.f9486s;
        return this.f9487t.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 0);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0813f2
    public final int Q(int i10) {
        CharSequence charSequence = this.f9486s;
        return this.f9487t.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 2);
    }
}
