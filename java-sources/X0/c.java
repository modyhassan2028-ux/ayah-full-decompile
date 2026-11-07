package X0;

import V0.q;
import V0.s;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i15)) != layout.getLineCount() - 1) {
            return;
        }
        q qVar = s.f8399a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fD = B0.c.D(layout, lineForOffset, paint) + B0.c.C(layout, lineForOffset, paint);
            if (fD == 0.0f) {
                return;
            }
            p251z9.j.b(canvas);
            canvas.translate(fD, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return 0;
    }
}
