package A1;

import F1.l;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k extends B9.a {
    public static Font f0(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? 700 : 400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iH0 = h0(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int iH1 = h0(fontStyle, font2.getStyle());
            if (iH1 < iH0) {
                font = font2;
                iH0 = iH1;
            }
        }
        return font;
    }

    public static FontFamily g0(l[] lVarArr, ContentResolver contentResolver) {
        FontFamily.Builder builder = null;
        for (l lVar : lVarArr) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(lVar.f2176a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(lVar.f2178c).setSlant(lVar.f2179d ? 1 : 0).setTtcIndex(lVar.f2177b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            } catch (IOException e10) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int h0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // B9.a
    public final Typeface l(Context context, p244z1.d dVar, Resources resources, int i10) {
        try {
            FontFamily.Builder builder = null;
            for (p244z1.e eVar : dVar.f24753a) {
                try {
                    Font fontBuild = new Font.Builder(resources, eVar.f24759f).setWeight(eVar.f24755b).setSlant(eVar.f24756c ? 1 : 0).setTtcIndex(eVar.f24758e).setFontVariationSettings(eVar.f24757d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(f0(fontFamilyBuild, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // B9.a
    public final Typeface m(Context context, l[] lVarArr, int i10) {
        try {
            FontFamily fontFamilyG0 = g0(lVarArr, context.getContentResolver());
            if (fontFamilyG0 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyG0).setStyle(f0(fontFamilyG0, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // B9.a
    public final Typeface n(Context context, List list, int i10) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyG0 = g0((l[]) list.get(0), contentResolver);
            if (fontFamilyG0 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyG0);
            for (int i11 = 1; i11 < list.size(); i11++) {
                FontFamily fontFamilyG1 = g0((l[]) list.get(i11), contentResolver);
                if (fontFamilyG1 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyG1);
                }
            }
            return customFallbackBuilder.setStyle(f0(fontFamilyG0, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // B9.a
    public final Typeface o(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // B9.a
    public final Typeface p(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font fontBuild = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // B9.a
    public final l u(l[] lVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
