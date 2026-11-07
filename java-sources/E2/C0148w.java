package E2;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: E2.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0148w extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0131k0 f1788b;

    public /* synthetic */ C0148w(AbstractC0131k0 abstractC0131k0, int i10) {
        this.f1787a = i10;
        this.f1788b = abstractC0131k0;
    }

    @Override // E2.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f1787a) {
            case 0:
                C0151z c0151z = (C0151z) this.f1788b;
                int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i12 = c0151z.f1801a;
                int iComputeVerticalScrollRange = c0151z.f1817s.computeVerticalScrollRange();
                int i13 = c0151z.f1816r;
                c0151z.f1818t = iComputeVerticalScrollRange - i13 > 0 && i13 >= i12;
                int iComputeHorizontalScrollRange = c0151z.f1817s.computeHorizontalScrollRange();
                int i14 = c0151z.f1815q;
                boolean z10 = iComputeHorizontalScrollRange - i14 > 0 && i14 >= i12;
                c0151z.f1819u = z10;
                boolean z11 = c0151z.f1818t;
                if (z11 || z10) {
                    if (z11) {
                        float f3 = i13;
                        c0151z.f1810l = (int) ((((f3 / 2.0f) + iComputeVerticalScrollOffset) * f3) / iComputeVerticalScrollRange);
                        c0151z.f1809k = Math.min(i13, (i13 * i13) / iComputeVerticalScrollRange);
                    }
                    if (c0151z.f1819u) {
                        float f7 = iComputeHorizontalScrollOffset;
                        float f10 = i14;
                        c0151z.f1813o = (int) ((((f10 / 2.0f) + f7) * f10) / iComputeHorizontalScrollRange);
                        c0151z.f1812n = Math.min(i14, (i14 * i14) / iComputeHorizontalScrollRange);
                    }
                    int i15 = c0151z.f1820v;
                    if (i15 == 0 || i15 == 1) {
                        c0151z.l(1);
                    }
                } else if (c0151z.f1820v != 0) {
                    c0151z.l(0);
                }
                break;
            default:
                P4.a aVar = (P4.a) this.f1788b;
                int iComputeHorizontalScrollOffset2 = recyclerView.computeHorizontalScrollOffset();
                int iComputeVerticalScrollOffset2 = recyclerView.computeVerticalScrollOffset();
                int i16 = aVar.f6647a;
                int iComputeVerticalScrollRange2 = aVar.f6663s.computeVerticalScrollRange();
                int i17 = aVar.f6662r;
                aVar.f6664t = iComputeVerticalScrollRange2 - i17 > 0 && i17 >= i16;
                int iComputeHorizontalScrollRange2 = aVar.f6663s.computeHorizontalScrollRange();
                int i18 = aVar.f6661q;
                boolean z12 = iComputeHorizontalScrollRange2 - i18 > 0 && i18 >= i16;
                aVar.f6665u = z12;
                boolean z13 = aVar.f6664t;
                if (z13 || z12) {
                    if (z13) {
                        float f11 = i17;
                        aVar.f6656l = (int) ((((f11 / 2.0f) + iComputeVerticalScrollOffset2) * f11) / iComputeVerticalScrollRange2);
                        aVar.f6655k = Math.min(i17, (i17 * i17) / iComputeVerticalScrollRange2);
                    }
                    if (aVar.f6665u) {
                        float f12 = iComputeHorizontalScrollOffset2;
                        float f13 = i18;
                        aVar.f6659o = (int) ((((f13 / 2.0f) + f12) * f13) / iComputeHorizontalScrollRange2);
                        aVar.f6658n = Math.min(i18, (i18 * i18) / iComputeHorizontalScrollRange2);
                    }
                    int i19 = aVar.f6666v;
                    if (i19 == 0 || i19 == 1) {
                        aVar.l(1);
                    }
                } else if (aVar.f6666v != 0) {
                    aVar.l(0);
                }
                break;
        }
    }
}
