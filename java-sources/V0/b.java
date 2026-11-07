package V0;

import A.R0;
import android.graphics.RectF;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static int[] a(r rVar, RectF rectF, int i10, final R0 r10) {
        return rVar.f8389f.getRangeForRect(rectF, i10 == 1 ? new W0.a(new L5.c(12, rVar.f8389f.getText(), rVar.j(), false)) : new GraphemeClusterSegmentFinder(rVar.f8389f.getText(), rVar.f8384a), new Layout.TextInclusionStrategy() { // from class: V0.a
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) r10.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }
}
