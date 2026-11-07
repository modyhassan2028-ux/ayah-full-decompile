package p222w7;

import A1.a;
import E2.AbstractC0131k0;
import E2.AbstractC0135m0;
import E2.B0;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ayah.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC0131k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f23764c;

    public d(int i10) {
        this.f23762a = i10;
        switch (i10) {
            case 1:
                this.f23763b = new Rect();
                break;
            default:
                Paint paint = new Paint();
                this.f23763b = paint;
                this.f23764c = DesugarCollections.unmodifiableList(new ArrayList());
                paint.setStrokeWidth(5.0f);
                paint.setColor(-65281);
                break;
        }
    }

    @Override // E2.AbstractC0131k0
    public void f(Rect rect, View view, RecyclerView recyclerView, B0 b5) {
        switch (this.f23762a) {
            case 1:
                j.e(rect, "outRect");
                j.e(view, "view");
                j.e(b5, "state");
                rect.set(0, 0, 0, 0);
                break;
            default:
                super.f(rect, view, recyclerView, b5);
                break;
        }
    }

    @Override // E2.AbstractC0131k0
    public final void h(Canvas canvas, RecyclerView recyclerView, B0 b5) {
        Canvas canvas2;
        switch (this.f23762a) {
            case 0:
                Paint paint = (Paint) this.f23763b;
                paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
                for (g gVar : (List) this.f23764c) {
                    paint.setColor(a.b(-65281, gVar.f23778c, -16776961));
                    if (((CarouselLayoutManager) recyclerView.getLayoutManager()).R0()) {
                        canvas2 = canvas;
                        canvas2.drawLine(gVar.f23777b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f14760y.e(), gVar.f23777b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f14760y.a(), paint);
                    } else {
                        float fB = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f14760y.b();
                        float f3 = gVar.f23777b;
                        float fC = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f14760y.c();
                        float f7 = gVar.f23777b;
                        canvas2 = canvas;
                        canvas2.drawLine(fB, f3, fC, f7, paint);
                    }
                    canvas = canvas2;
                }
                break;
            default:
                j.e(canvas, "c");
                j.e(b5, "state");
                Rect rect = (Rect) this.f23763b;
                p230x6.a aVar = (p230x6.a) this.f23764c;
                if (aVar != null) {
                    int i10 = aVar.f24383a;
                    canvas.save();
                    float f10 = i10;
                    canvas.translate(f10, 0.0f);
                    int height = recyclerView.getHeight();
                    int childCount = recyclerView.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = recyclerView.getChildAt(i11);
                        j.b(recyclerView.getLayoutManager());
                        aVar.f24386d = AbstractC0135m0.H(childAt) % 2 == 0;
                        AbstractC0135m0 layoutManager = recyclerView.getLayoutManager();
                        j.b(layoutManager);
                        layoutManager.z(rect, childAt);
                        int iV = B9.a.V(childAt.getTranslationX()) + rect.right;
                        aVar.setBounds(iV - i10, 0, iV, height);
                        aVar.draw(canvas);
                    }
                    canvas.translate(-f10, 0.0f);
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
