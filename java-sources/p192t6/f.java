package p192t6;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.ayah.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p125m4.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f22619a = Pattern.compile("^(\\d+[.\\-])");

    public static void a(Context context, Spannable spannable, String str, String str2, String str3, int i10, Class cls) {
        boolean z10;
        int iIndexOf;
        Object dVar;
        for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannable.getSpans(i10, str.length() + i10, cls)) {
            spannable.removeSpan(foregroundColorSpan);
        }
        int i11 = 0;
        do {
            int iIndexOf2 = str.indexOf(str2, i11);
            z10 = true;
            if (iIndexOf2 > -1 && (iIndexOf = str.indexOf(str3, iIndexOf2)) > -1) {
                if (cls.equals(a.class)) {
                    dVar = new a(context.getColor(R.color.tint_text));
                } else if (cls.equals(e.class)) {
                    dVar = new e(context.getColor(R.color.red_text));
                    int i12 = i10 + iIndexOf2;
                    spannable.setSpan(new b(), i12, i12 + 1, 33);
                    int i13 = i10 + iIndexOf;
                    spannable.setSpan(new b(), i13, i13 + 1, 33);
                } else {
                    dVar = new d(context.getColor(R.color.secondary_text));
                }
                spannable.setSpan(dVar, iIndexOf2 + i10, i10 + iIndexOf + 1, 33);
                z10 = false;
                i11 = iIndexOf;
            }
        } while (!z10);
    }

    public static void b(Context context, Editable editable, int i10, int i11) {
        Context context2;
        Editable editable2;
        String string = editable.toString();
        int i12 = i10;
        while (true) {
            int iIndexOf = string.indexOf("\n", i12);
            String strSubstring = iIndexOf > 0 ? string.substring(i12, iIndexOf) : string.substring(i12);
            int length = iIndexOf == -1 ? strSubstring.length() + i12 : iIndexOf;
            Matcher matcher = f22619a.matcher(strSubstring);
            int length2 = matcher.find() ? matcher.group(1).length() - 1 : -1;
            c[] cVarArr = (c[]) editable.getSpans(i12, length, c.class);
            if (strSubstring.length() < 2 || cVarArr.length != 0) {
                if (cVarArr.length > 0 && length2 < 0) {
                    editable.removeSpan(cVarArr[0]);
                }
            } else if (length2 > -1) {
                editable.setSpan(new c(-7829368), i12, length2 + i12 + 1, 33);
            }
            if (strSubstring.isEmpty()) {
                context2 = context;
                editable2 = editable;
            } else {
                context2 = context;
                editable2 = editable;
                a(context2, editable2, strSubstring, "﴿", "﴾", i12, a.class);
                a(context2, editable2, strSubstring, "[", "]", i12, d.class);
            }
            if (iIndexOf > -1) {
                iIndexOf++;
            }
            i12 = iIndexOf;
            if (i12 < 0 || i11 <= length) {
                return;
            }
            context = context2;
            editable = editable2;
        }
    }

    public static void c(Context context, TextView textView, boolean z10, boolean z11) {
        Typeface typefaceA;
        if (b.b()) {
            typefaceA = p106k4.b.f18991b.a(context, z10 ? 2 : 1);
        } else {
            typefaceA = z10 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
        }
        textView.setTypeface(typefaceA);
        if (z11) {
            textView.setTextColor(context.getColor(R.color.text));
        }
    }
}
