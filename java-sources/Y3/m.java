package Y3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.LruCache;
import com.ayah.R;
import java.util.LinkedHashMap;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends Drawable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final LinkedHashMap f10410k = new LinkedHashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final LinkedHashMap f10411l = new LinkedHashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final LruCache f10412m = new LruCache(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f10413n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f10415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f10416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f10417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p110k9.o f10418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p110k9.o f10419f;
    public final p110k9.o g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f10420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f10421i;
    public TextPaint j;

    public m(Context context, j jVar) {
        int i10;
        p251z9.j.e(context, "context");
        this.f10414a = context;
        this.f10415b = jVar;
        this.f10416c = new Paint();
        final int i11 = 0;
        this.f10418e = p110k9.a.d(new p241y9.a(this) { // from class: Y3.l

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ m f10409s;

            {
                this.f10409s = this;
            }

            @Override // p241y9.a
            public final Object invoke() {
                int i12;
                Integer num;
                switch (i11) {
                    case 0:
                        return Boolean.valueOf(this.f10409s.f10414a.getResources().getBoolean(R.bool.is_dark_mode));
                    case 1:
                        m mVar = this.f10409s;
                        p110k9.o oVar = mVar.f10418e;
                        Resources resources = mVar.f10414a.getResources();
                        p251z9.j.d(resources, "getResources(...)");
                        va.g gVar = mVar.f10415b.f10406e;
                        if (gVar instanceof t) {
                            i12 = 2131231033;
                        } else {
                            if (!(gVar instanceof u)) {
                                throw new A6.a();
                            }
                            i12 = 2131231038;
                        }
                        LinkedHashMap linkedHashMap = m.f10411l;
                        if (((Boolean) oVar.getValue()).booleanValue() != m.f10413n) {
                            linkedHashMap.clear();
                            m.f10413n = ((Boolean) oVar.getValue()).booleanValue();
                        }
                        int i13 = (((Boolean) oVar.getValue()).booleanValue() && i12 == 2131231038) ? 2131231033 : i12;
                        Bitmap bitmap = (Bitmap) linkedHashMap.get(Integer.valueOf(i13));
                        if (bitmap != null) {
                            return bitmap;
                        }
                        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, i13);
                        linkedHashMap.put(Integer.valueOf(i13), bitmapDecodeResource);
                        p251z9.j.b(bitmapDecodeResource);
                        return bitmapDecodeResource;
                    default:
                        m mVar2 = this.f10409s;
                        Resources resources2 = mVar2.f10414a.getResources();
                        p251z9.j.d(resources2, "getResources(...)");
                        u0 u0VarB = mVar2.f10415b.f10406e.B();
                        if (u0VarB instanceof n) {
                            num = 2131231034;
                        } else if (p251z9.j.a(u0VarB, o.f10423i)) {
                            num = 2131231035;
                        } else if (p251z9.j.a(u0VarB, p.f10424i)) {
                            num = 2131231036;
                        } else if (p251z9.j.a(u0VarB, q.f10425i)) {
                            num = null;
                        } else if (p251z9.j.a(u0VarB, r.f10426i)) {
                            num = 2131231037;
                        } else {
                            if (!p251z9.j.a(u0VarB, s.f10427i)) {
                                throw new A6.a();
                            }
                            num = 2131231039;
                        }
                        if (num == null) {
                            return null;
                        }
                        int iIntValue = num.intValue();
                        LinkedHashMap linkedHashMap2 = m.f10410k;
                        Bitmap bitmap2 = (Bitmap) linkedHashMap2.get(num);
                        if (bitmap2 != null) {
                            return bitmap2;
                        }
                        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(resources2, iIntValue);
                        linkedHashMap2.put(num, bitmapDecodeResource2);
                        p251z9.j.b(bitmapDecodeResource2);
                        return bitmapDecodeResource2;
                }
            }
        });
        final int i12 = 1;
        this.f10419f = p110k9.a.d(new p241y9.a(this) { // from class: Y3.l

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ m f10409s;

            {
                this.f10409s = this;
            }

            @Override // p241y9.a
            public final Object invoke() {
                int i13;
                Integer num;
                switch (i12) {
                    case 0:
                        return Boolean.valueOf(this.f10409s.f10414a.getResources().getBoolean(R.bool.is_dark_mode));
                    case 1:
                        m mVar = this.f10409s;
                        p110k9.o oVar = mVar.f10418e;
                        Resources resources = mVar.f10414a.getResources();
                        p251z9.j.d(resources, "getResources(...)");
                        va.g gVar = mVar.f10415b.f10406e;
                        if (gVar instanceof t) {
                            i13 = 2131231033;
                        } else {
                            if (!(gVar instanceof u)) {
                                throw new A6.a();
                            }
                            i13 = 2131231038;
                        }
                        LinkedHashMap linkedHashMap = m.f10411l;
                        if (((Boolean) oVar.getValue()).booleanValue() != m.f10413n) {
                            linkedHashMap.clear();
                            m.f10413n = ((Boolean) oVar.getValue()).booleanValue();
                        }
                        int i14 = (((Boolean) oVar.getValue()).booleanValue() && i13 == 2131231038) ? 2131231033 : i13;
                        Bitmap bitmap = (Bitmap) linkedHashMap.get(Integer.valueOf(i14));
                        if (bitmap != null) {
                            return bitmap;
                        }
                        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, i14);
                        linkedHashMap.put(Integer.valueOf(i14), bitmapDecodeResource);
                        p251z9.j.b(bitmapDecodeResource);
                        return bitmapDecodeResource;
                    default:
                        m mVar2 = this.f10409s;
                        Resources resources2 = mVar2.f10414a.getResources();
                        p251z9.j.d(resources2, "getResources(...)");
                        u0 u0VarB = mVar2.f10415b.f10406e.B();
                        if (u0VarB instanceof n) {
                            num = 2131231034;
                        } else if (p251z9.j.a(u0VarB, o.f10423i)) {
                            num = 2131231035;
                        } else if (p251z9.j.a(u0VarB, p.f10424i)) {
                            num = 2131231036;
                        } else if (p251z9.j.a(u0VarB, q.f10425i)) {
                            num = null;
                        } else if (p251z9.j.a(u0VarB, r.f10426i)) {
                            num = 2131231037;
                        } else {
                            if (!p251z9.j.a(u0VarB, s.f10427i)) {
                                throw new A6.a();
                            }
                            num = 2131231039;
                        }
                        if (num == null) {
                            return null;
                        }
                        int iIntValue = num.intValue();
                        LinkedHashMap linkedHashMap2 = m.f10410k;
                        Bitmap bitmap2 = (Bitmap) linkedHashMap2.get(num);
                        if (bitmap2 != null) {
                            return bitmap2;
                        }
                        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(resources2, iIntValue);
                        linkedHashMap2.put(num, bitmapDecodeResource2);
                        p251z9.j.b(bitmapDecodeResource2);
                        return bitmapDecodeResource2;
                }
            }
        });
        final int i13 = 2;
        this.g = p110k9.a.d(new p241y9.a(this) { // from class: Y3.l

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ m f10409s;

            {
                this.f10409s = this;
            }

            @Override // p241y9.a
            public final Object invoke() {
                int i14;
                Integer num;
                switch (i13) {
                    case 0:
                        return Boolean.valueOf(this.f10409s.f10414a.getResources().getBoolean(R.bool.is_dark_mode));
                    case 1:
                        m mVar = this.f10409s;
                        p110k9.o oVar = mVar.f10418e;
                        Resources resources = mVar.f10414a.getResources();
                        p251z9.j.d(resources, "getResources(...)");
                        va.g gVar = mVar.f10415b.f10406e;
                        if (gVar instanceof t) {
                            i14 = 2131231033;
                        } else {
                            if (!(gVar instanceof u)) {
                                throw new A6.a();
                            }
                            i14 = 2131231038;
                        }
                        LinkedHashMap linkedHashMap = m.f10411l;
                        if (((Boolean) oVar.getValue()).booleanValue() != m.f10413n) {
                            linkedHashMap.clear();
                            m.f10413n = ((Boolean) oVar.getValue()).booleanValue();
                        }
                        int i15 = (((Boolean) oVar.getValue()).booleanValue() && i14 == 2131231038) ? 2131231033 : i14;
                        Bitmap bitmap = (Bitmap) linkedHashMap.get(Integer.valueOf(i15));
                        if (bitmap != null) {
                            return bitmap;
                        }
                        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, i15);
                        linkedHashMap.put(Integer.valueOf(i15), bitmapDecodeResource);
                        p251z9.j.b(bitmapDecodeResource);
                        return bitmapDecodeResource;
                    default:
                        m mVar2 = this.f10409s;
                        Resources resources2 = mVar2.f10414a.getResources();
                        p251z9.j.d(resources2, "getResources(...)");
                        u0 u0VarB = mVar2.f10415b.f10406e.B();
                        if (u0VarB instanceof n) {
                            num = 2131231034;
                        } else if (p251z9.j.a(u0VarB, o.f10423i)) {
                            num = 2131231035;
                        } else if (p251z9.j.a(u0VarB, p.f10424i)) {
                            num = 2131231036;
                        } else if (p251z9.j.a(u0VarB, q.f10425i)) {
                            num = null;
                        } else if (p251z9.j.a(u0VarB, r.f10426i)) {
                            num = 2131231037;
                        } else {
                            if (!p251z9.j.a(u0VarB, s.f10427i)) {
                                throw new A6.a();
                            }
                            num = 2131231039;
                        }
                        if (num == null) {
                            return null;
                        }
                        int iIntValue = num.intValue();
                        LinkedHashMap linkedHashMap2 = m.f10410k;
                        Bitmap bitmap2 = (Bitmap) linkedHashMap2.get(num);
                        if (bitmap2 != null) {
                            return bitmap2;
                        }
                        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(resources2, iIntValue);
                        linkedHashMap2.put(num, bitmapDecodeResource2);
                        p251z9.j.b(bitmapDecodeResource2);
                        return bitmapDecodeResource2;
                }
            }
        });
        u0 u0VarB = jVar.f10406e.B();
        if (u0VarB instanceof n) {
            i10 = ((n) u0VarB).f10422i.f5683t;
        } else {
            boolean zA = p251z9.j.a(u0VarB, o.f10423i);
            int i14 = R.color.tint;
            if (zA || p251z9.j.a(u0VarB, p.f10424i)) {
                i10 = i14;
            } else if (p251z9.j.a(u0VarB, q.f10425i)) {
                i10 = R.color.quran_tint;
            } else {
                boolean zA2 = p251z9.j.a(u0VarB, r.f10426i);
                i14 = R.color.orange_bookmark_verse_marker;
                if (!zA2 && !p251z9.j.a(u0VarB, s.f10427i)) {
                    throw new A6.a();
                }
                i10 = i14;
            }
        }
        int color = context.getColor(i10);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        this.f10417d = paint;
    }

    public final void a(float f3) {
        Context context = this.f10414a;
        p251z9.j.e(context, "context");
        Float fValueOf = Float.valueOf(f3);
        LruCache lruCache = f10412m;
        TextPaint textPaint = (TextPaint) lruCache.get(fValueOf);
        if (textPaint == null) {
            Typeface typefaceA = p106k4.b.f18991b.a(context.getApplicationContext(), 5);
            p251z9.j.d(typefaceA, "getTypeface(...)");
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setTypeface(typefaceA);
            textPaint2.setFlags(1);
            textPaint2.setTextSize(f3);
            lruCache.put(Float.valueOf(f3), textPaint2);
            textPaint = textPaint2;
        }
        textPaint.setColor(context.getColor(R.color.text));
        float f7 = 2;
        this.f10421i = (textPaint.descent() + textPaint.ascent()) / f7;
        this.j = textPaint;
        this.f10420h = (getBounds().width() - textPaint.measureText(this.f10415b.f10403b)) / f7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        p251z9.j.e(canvas, "canvas");
        Rect bounds = getBounds();
        p251z9.j.d(bounds, "getBounds(...)");
        canvas.drawBitmap((Bitmap) this.f10419f.getValue(), (Rect) null, bounds, this.f10416c);
        Bitmap bitmap = (Bitmap) this.g.getValue();
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f10417d);
            return;
        }
        float f3 = this.f10420h + bounds.left;
        float fCenterY = bounds.centerY() - this.f10421i;
        TextPaint textPaint = this.j;
        if (textPaint != null) {
            canvas.drawText(this.f10415b.f10403b, f3, fCenterY, textPaint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((Bitmap) this.f10419f.getValue()).getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((Bitmap) this.f10419f.getValue()).getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        p251z9.j.e(rect, "bounds");
        super.onBoundsChange(rect);
        TextPaint textPaint = this.j;
        if (textPaint != null) {
            this.f10420h = (getBounds().width() - textPaint.measureText(this.f10415b.f10403b)) / 2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Context context, p124m3.j jVar, va.g gVar) {
        this(context, new j(jVar.b().f19608a, jVar.b().f19609b, jVar.b().f19610c, jVar.b().f19611d, gVar));
        p251z9.j.e(context, "context");
        p251z9.j.e(jVar, "verseDao");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
