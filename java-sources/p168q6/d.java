package p168q6;

import B3.f;
import E2.AbstractC0115c0;
import E2.F0;
import E5.a;
import K0.C0362p;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.ayah.R;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import p110k9.o;
import p114l3.b;
import p120l9.m;
import p124m3.g;
import p124m3.h;
import p135n4.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC0115c0 implements Filterable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String[] f21319C = {"أ", "إ", "آ", "ة", "ى", "ئ", "ؤ", "-"};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String[] f21320D = {"ا", "ا", "ا", "ه", "ي", "ي", "و", ""};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final NumberFormat f21321A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final o f21322B;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Context f21323u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b f21324v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0362p f21325w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a f21326x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LayoutInflater f21327y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f21328z;

    public d(Context context, b bVar, C0362p c0362p, a aVar) {
        j.e(context, "context");
        j.e(bVar, "pageTypeDecider");
        this.f21323u = context;
        this.f21324v = bVar;
        this.f21325w = c0362p;
        this.f21326x = aVar;
        this.f21327y = LayoutInflater.from(context);
        this.f21328z = new ArrayList();
        this.f21321A = p125m4.b.f19615b;
        this.f21322B = p110k9.a.d(new f(18, this));
    }

    public static final String j(d dVar, String str) {
        for (int i10 = 0; i10 < 8; i10++) {
            String str2 = f21319C[i10];
            j.e(str2, "pattern");
            Pattern patternCompile = Pattern.compile(str2);
            j.d(patternCompile, "compile(...)");
            String str3 = f21320D[i10];
            j.e(str, "input");
            j.e(str3, "replacement");
            str = patternCompile.matcher(str).replaceAll(str3);
            j.d(str, "replaceAll(...)");
        }
        return str;
    }

    @Override // E2.AbstractC0115c0
    public final int a() {
        return this.f21328z.size();
    }

    @Override // E2.AbstractC0115c0
    public final int c(int i10) {
        return (((p156p4.a) this.f21328z.get(i10)).f20984b != null ? 1 : 0) ^ 1;
    }

    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, java.util.List] */
    @Override // E2.AbstractC0115c0
    public final void e(F0 f3, int i10) {
        String string;
        g gVar = (g) f3;
        boolean z10 = gVar instanceof e;
        int i11 = 0;
        ArrayList arrayList = this.f21328z;
        if (z10) {
            p221w6.a aVar = ((p156p4.a) arrayList.get(i10)).f20984b;
            TextView textView = ((e) gVar).f21330v;
            Context context = textView.getContext();
            int i12 = aVar.f23744a;
            if (i12 > 0) {
                string = context.getString(i12, aVar.f23745b);
            } else {
                p125m4.b.b();
                string = null;
            }
            textView.setText(string);
            return;
        }
        AbstractC0813f2 abstractC0813f2 = ((p156p4.a) arrayList.get(i10)).f20983a;
        j.d(abstractC0813f2, "getItem(...)");
        f fVar = (f) gVar;
        TextView textView2 = fVar.f21333w;
        TextView textView3 = fVar.f21334x;
        TextView textView4 = fVar.f21332v;
        boolean z11 = abstractC0813f2 instanceof p135n4.d;
        NumberFormat numberFormat = this.f21321A;
        Context context2 = this.f21323u;
        if (z11) {
            p135n4.d dVar = (p135n4.d) abstractC0813f2;
            p124m3.j jVar = dVar.f20009s;
            textView4.setText(jVar.d(context2));
            textView2.setText(numberFormat.format(jVar.c()));
            if (dVar.f20010t) {
                i11 = 8;
            } else {
                textView3.setText(jVar.f19590f);
            }
        } else if (abstractC0813f2 instanceof p135n4.a) {
            p124m3.d dVar2 = ((p135n4.a) abstractC0813f2).f20006s;
            String string2 = context2.getString(R.string.page);
            j.d(string2, "getString(...)");
            textView4.setText(String.format(string2, Arrays.copyOf(new Object[]{numberFormat.format(dVar2.f19550b)}, 1)));
            textView2.setText(context2.getResources().getStringArray(R.array.sura_names)[((p124m3.j) m.f0(dVar2.a())).f19595m - 1]);
            i11 = 8;
        } else if (abstractC0813f2 instanceof p135n4.b) {
            g gVar2 = ((p135n4.b) abstractC0813f2).f20007s;
            gVar2.getClass();
            textView4.setText(p125m4.b.b() ? gVar2.f19569c : gVar2.f19570d);
            textView3.setText(((p124m3.j) m.f0(gVar2.g)).f19590f);
        } else {
            if (!(abstractC0813f2 instanceof c)) {
                throw new A6.a();
            }
            h hVar = ((c) abstractC0813f2).f20008s;
            hVar.getClass();
            String str = p125m4.b.b() ? hVar.f19578d : hVar.f19579e;
            p124m3.j jVar2 = hVar.g;
            textView4.setText(str);
            textView3.setText(jVar2.f19590f);
            textView2.setText(context2.getResources().getStringArray(R.array.sura_names)[jVar2.f19595m - 1]);
        }
        textView3.setVisibility(i11);
    }

    @Override // E2.AbstractC0115c0
    public final F0 g(ViewGroup viewGroup, int i10) {
        LayoutInflater layoutInflater = this.f21327y;
        if (i10 == 0) {
            View viewInflate = layoutInflater.inflate(R.layout.header, viewGroup, false);
            j.b(viewInflate);
            return new e(viewInflate);
        }
        View viewInflate2 = layoutInflater.inflate(R.layout.index_simple_row_item, viewGroup, false);
        viewInflate2.setOnClickListener(new E5.b(8, this));
        return new f(viewInflate2);
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new O1.c(this);
    }
}
