package p244z1;

import A1.f;
import E2.N0;
import F2.x;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f24770a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f24771b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f24772c = new Object();

    public static void a(h hVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f24772c) {
            try {
                WeakHashMap weakHashMap = f24771b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(hVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(hVar, sparseArray);
                }
                sparseArray.append(i10, new g(colorStateList, hVar.f24768a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface b(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i10, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    public static Typeface c(Context context, int i10, TypedValue typedValue, int i11, a aVar, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i10) + "\" (" + Integer.toHexString(i10) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i12 = typedValue.assetCookie;
            N0 n6 = f.f470b;
            Typeface typeface = (Typeface) n6.g(f.b(resources, i10, string, i12, i11));
            if (typeface != null) {
                if (aVar != null) {
                    new Handler(Looper.getMainLooper()).post(new x(19, aVar, typeface));
                }
                typefaceA = typeface;
            } else if (!z11) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        c cVarL = a.l(resources.getXml(i10), resources);
                        if (cVarL == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (aVar != null) {
                                aVar.a(-3);
                            }
                        } else {
                            typefaceA = f.a(context, cVarL, resources, i10, string, typedValue.assetCookie, i11, aVar, z10);
                        }
                    } else {
                        int i13 = typedValue.assetCookie;
                        Typeface typefaceP = f.f469a.p(context, resources, i10, string, i11);
                        if (typefaceP != null) {
                            n6.k(f.b(resources, i10, string, i13, i11), typefaceP);
                        }
                        if (aVar != null) {
                            if (typefaceP != null) {
                                new Handler(Looper.getMainLooper()).post(new x(19, aVar, typefaceP));
                            } else {
                                aVar.a(-3);
                            }
                        }
                        typefaceA = typefaceP;
                    }
                } catch (IOException e10) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e10);
                    if (aVar != null) {
                        aVar.a(-3);
                    }
                } catch (XmlPullParserException e11) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e11);
                    if (aVar != null) {
                        aVar.a(-3);
                    }
                }
            }
        } else if (aVar != null) {
            aVar.a(-3);
        }
        if (typefaceA != null || aVar != null || z11) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }
}
