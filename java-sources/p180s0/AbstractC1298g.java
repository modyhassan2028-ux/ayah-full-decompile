package p180s0;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.DisplayMetrics;
import j$.util.function.DoubleUnaryOperator$CC;
import java.util.function.DoubleUnaryOperator;
import p187t0.c;
import p187t0.d;
import p187t0.p;
import p187t0.q;
import p187t0.r;
import p251z9.j;

/* JADX INFO: renamed from: s0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1298g {
    public static final Bitmap a(C1297f c1297f) {
        if (c1297f instanceof C1297f) {
            return c1297f.f21826a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final Bitmap b(int i10, int i11, int i12, c cVar) {
        ColorSpace rgb;
        ColorSpace colorSpaceA;
        ColorSpace colorSpace;
        Bitmap.Config configC = c(i12);
        if (j.a(cVar, d.f22517e)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (j.a(cVar, d.f22527q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (j.a(cVar, d.f22528r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (j.a(cVar, d.f22525o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (j.a(cVar, d.j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (j.a(cVar, d.f22520i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (j.a(cVar, d.f22530t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (j.a(cVar, d.f22529s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (j.a(cVar, d.f22521k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (j.a(cVar, d.f22522l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (j.a(cVar, d.g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (j.a(cVar, d.f22519h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (j.a(cVar, d.f22518f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (j.a(cVar, d.f22523m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else {
            if (!j.a(cVar, d.f22526p)) {
                if (j.a(cVar, d.f22524n)) {
                    colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
                } else if (Build.VERSION.SDK_INT >= 34 && (colorSpaceA = t.a(cVar)) != null) {
                    rgb = colorSpaceA;
                    configC = configC;
                } else if (cVar instanceof q) {
                    String str = cVar.f22510a;
                    q qVar = (q) cVar;
                    float[] fArrA = qVar.f22561d.a();
                    r rVar = qVar.g;
                    ColorSpace.Rgb.TransferParameters transferParameters = rVar != null ? new ColorSpace.Rgb.TransferParameters(rVar.f22574b, rVar.f22575c, rVar.f22576d, rVar.f22577e, rVar.f22578f, rVar.g, rVar.f22573a) : null;
                    if (transferParameters != null) {
                        rgb = new ColorSpace.Rgb(str, qVar.f22564h, fArrA, transferParameters);
                    } else {
                        float[] fArr = qVar.f22564h;
                        final p pVar = qVar.f22567l;
                        final int i13 = 0;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: s0.s
                            public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator2) {
                                int i14 = i13;
                                return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator2);
                            }

                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d5) {
                                switch (i13) {
                                    case 0:
                                        break;
                                }
                                return ((Number) pVar.e(Double.valueOf(d5))).doubleValue();
                            }

                            public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator2) {
                                int i14 = i13;
                                return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator2);
                            }
                        };
                        final p pVar2 = qVar.f22570o;
                        final int i14 = 1;
                        rgb = new ColorSpace.Rgb(str, fArr, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: s0.s
                            public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator2) {
                                int i15 = i14;
                                return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator2);
                            }

                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d5) {
                                switch (i14) {
                                    case 0:
                                        break;
                                }
                                return ((Number) pVar2.e(Double.valueOf(d5))).doubleValue();
                            }

                            public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator2) {
                                int i15 = i14;
                                return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator2);
                            }
                        }, qVar.f22562e, qVar.f22563f);
                    }
                } else {
                    configC = configC;
                    rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return Bitmap.createBitmap((DisplayMetrics) null, i10, i11, configC, true, rgb);
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        rgb = colorSpace;
        configC = configC;
        return Bitmap.createBitmap((DisplayMetrics) null, i10, i11, configC, true, rgb);
    }

    public static final Bitmap.Config c(int i10) {
        if (i10 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i10 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i10 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26 || i10 != 3) {
            return (i11 < 26 || i10 != 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.RGBA_F16;
    }

    public static final int d(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26 || config != Bitmap.Config.RGBA_F16) {
            return (i10 < 26 || config != Bitmap.Config.HARDWARE) ? 0 : 4;
        }
        return 3;
    }
}
