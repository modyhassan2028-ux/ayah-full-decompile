package F5;

import Y3.c;
import Y3.d;
import Y3.e;
import Y3.f;
import Y3.i;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import com.ayah.R;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f2405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f2406b;

    public b(Context context, i iVar) {
        int i10;
        int color;
        this.f2405a = iVar;
        p050e8.b bVar = iVar.f10402e;
        if (bVar.equals(e.f10393e)) {
            i10 = R.color.quran_section;
        } else if (bVar.equals(f.f10394e)) {
            i10 = R.color.quran_selection;
        } else {
            if (!bVar.equals(c.f10391e) && !bVar.equals(Y3.b.f10390e)) {
                if (bVar.equals(d.f10392e)) {
                    color = 0;
                } else {
                    if (!(bVar instanceof Y3.a)) {
                        throw new A6.a();
                    }
                    i10 = ((Y3.a) bVar).f10389e;
                }
                Paint paint = new Paint();
                paint.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                this.f2406b = paint;
            }
            i10 = R.color.tint_highlight;
        }
        color = context.getColor(i10);
        Paint paint2 = new Paint();
        paint2.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        this.f2406b = paint2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        j.e(canvas, "canvas");
        if (this.f2405a.f10402e instanceof d) {
            return;
        }
        canvas.drawRect(getBounds(), this.f2406b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
