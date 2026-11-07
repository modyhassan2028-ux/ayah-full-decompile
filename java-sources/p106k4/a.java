package p106k4;

import A3.e;
import E9.d;
import G9.g;
import G9.h;
import G9.o;
import H9.k;
import H9.m;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.ayah.R;
import java.util.Iterator;
import java.util.List;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f18987a = new m("﴿.*?﴾");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f18988b = new m("\\*.*?\\*");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f18989c = new m("[«|»]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f18990d = new m("\\[.*?]]?");

    public static void b(SpannableStringBuilder spannableStringBuilder, Context context, int i10, d dVar) {
        spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getColor(i10)), dVar.f1995r, dVar.f1996s + 1, 17);
    }

    public final SpannableStringBuilder a(Context context, String str, List list, String str2) {
        j.e(context, "context");
        j.e(str, "text");
        j.e(list, "emphases");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (str2 != null) {
            h hVar = new h(m.a(new m(str2), spannableStringBuilder));
            while (hVar.hasNext()) {
                b(spannableStringBuilder, context, R.color.secondary_text, ((k) hVar.next()).a());
            }
        }
        h hVar2 = new h(m.a(f18987a, spannableStringBuilder));
        while (hVar2.hasNext()) {
            b(spannableStringBuilder, context, R.color.tint_text, ((k) hVar2.next()).a());
        }
        h hVar3 = new h(m.a(f18989c, spannableStringBuilder));
        while (hVar3.hasNext()) {
            b(spannableStringBuilder, context, R.color.tint_text, ((k) hVar3.next()).a());
        }
        g gVarA = m.a(f18988b, spannableStringBuilder);
        e eVar = new e(this, spannableStringBuilder, context);
        o oVar = o.f2946z;
        Iterator it = p120l9.m.v0(G9.k.e0(new g(gVarA, eVar))).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            spannableStringBuilder.delete(iIntValue, iIntValue + 1);
        }
        h hVar4 = new h(m.a(f18990d, spannableStringBuilder));
        while (hVar4.hasNext()) {
            b(spannableStringBuilder, context, R.color.secondary_text, ((k) hVar4.next()).a());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            p134n3.j jVar = (p134n3.j) it2.next();
            int i10 = jVar.f20004a;
            b(spannableStringBuilder, context, R.color.red_text, new d(i10, (jVar.f20005b + i10) - 1, 1));
        }
        return spannableStringBuilder;
    }
}
