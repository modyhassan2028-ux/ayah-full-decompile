package p057f4;

import K9.InterfaceC0402u;
import L5.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.ayah.R;
import java.io.IOException;
import p046e4.a;
import p106k4.b;
import p110k9.y;
import p241y9.e;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16208r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16209s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16210t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f16211u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f16212v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f16213w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f16214x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f16215y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, Context context, c cVar, int i10, boolean z10, p150o9.c cVar2) {
        super(2, cVar2);
        this.f16211u = aVar;
        this.f16212v = context;
        this.f16213w = cVar;
        this.f16214x = i10;
        this.f16215y = z10;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        return new d(this.f16211u, this.f16212v, this.f16213w, this.f16214x, this.f16215y, cVar);
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) throws IOException {
        int color;
        int i10;
        int i11 = this.f16210t;
        Context context = this.f16212v;
        a aVar = this.f16211u;
        if (i11 == 0) {
            p110k9.a.e(obj);
            aVar.getClass();
            color = context.getColor(R.color.quran_text);
            this.f16208r = 1440;
            this.f16209s = color;
            this.f16210t = 1;
            obj = c.j(this.f16213w, context, this.f16214x, aVar, this);
            p161p9.a aVar2 = p161p9.a.f21156r;
            if (obj == aVar2) {
                return aVar2;
            }
            i10 = 1440;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            color = this.f16209s;
            i10 = this.f16208r;
            p110k9.a.e(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        Typeface typefaceA = b.f18991b.a(context, 4);
        j.d(typefaceA, "getTypeface(...)");
        TextPaint textPaint = new TextPaint(193);
        textPaint.setTypeface(typefaceA);
        textPaint.setColor(color);
        aVar.getClass();
        textPaint.setTextSize(1440 / 15.0f);
        float fDescent = textPaint.descent() - textPaint.ascent();
        Paint paint = new Paint(7);
        if (!this.f16215y) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1440, bitmap.getHeight() + 26 + ((int) fDescent), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        float f3 = 2;
        float f7 = fDescent / f3;
        canvas.drawText("ﭡﭢﭣﭤ", (i10 - textPaint.measureText("ﭡﭢﭣﭤ")) / f3, ((f7 - textPaint.descent()) + (186 + f7)) - 3, textPaint);
        return bitmapCreateBitmap;
    }
}
