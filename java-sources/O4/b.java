package O4;

import E2.AbstractC0115c0;
import E2.F0;
import H9.v;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ayah.R;
import com.ayah.feature.infolist.ui.view.widget.NumberCircleView;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import p120l9.r;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0115c0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayList f6476A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public List f6477B;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Context f6478u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p251z9.h f6479v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p251z9.h f6480w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final NumberFormat f6481x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LayoutInflater f6482y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String[] f6483z;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Context context, p241y9.e eVar, p241y9.e eVar2) {
        NumberFormat numberFormat = p125m4.b.f19615b;
        j.d(numberFormat, "getNumberFormatter(...)");
        this.f6478u = context;
        this.f6479v = (p251z9.h) eVar;
        this.f6480w = (p251z9.h) eVar2;
        this.f6481x = numberFormat;
        this.f6482y = LayoutInflater.from(context);
        String[] stringArray = context.getResources().getStringArray(R.array.sura_names);
        j.d(stringArray, "getStringArray(...)");
        this.f6483z = stringArray;
        this.f6476A = new ArrayList();
        this.f6477B = r.f19440r;
    }

    @Override // E2.AbstractC0115c0
    public final int a() {
        return this.f6476A.size();
    }

    @Override // E2.AbstractC0115c0
    public final int c(int i10) {
        J4.e eVar = (J4.e) this.f6476A.get(i10);
        if (eVar instanceof J4.b) {
            return 0;
        }
        if (eVar instanceof J4.a) {
            return 1;
        }
        if (eVar instanceof J4.d) {
            return 2;
        }
        if (eVar instanceof J4.c) {
            return 3;
        }
        throw new A6.a();
    }

    @Override // E2.AbstractC0115c0
    public final void f(F0 f3, int i10, List list) {
        d dVar;
        h hVar = (h) f3;
        j.e(list, "payloads");
        if (!list.contains("selectionChanged")) {
            e(hVar, i10);
            return;
        }
        J4.e eVar = (J4.e) this.f6476A.get(i10);
        boolean z10 = eVar instanceof J4.d;
        NumberFormat numberFormat = this.f6481x;
        if (z10) {
            dVar = hVar instanceof g ? (g) hVar : null;
            if (dVar == null) {
                return;
            }
            p124m3.a aVar = ((J4.d) eVar).f4326a;
            NumberCircleView numberCircleView = dVar.f6488x;
            String str = numberFormat.format(Integer.valueOf(aVar.f19528b));
            j.d(str, "format(...)");
            numberCircleView.setDrawableInfo(0, str, this.f6477B.contains(Integer.valueOf(i10)));
            return;
        }
        if (!(eVar instanceof J4.c)) {
            e(hVar, i10);
            return;
        }
        dVar = hVar instanceof f ? (f) hVar : null;
        if (dVar == null) {
            return;
        }
        p124m3.h hVar2 = ((J4.c) eVar).f4325a;
        String str2 = hVar2.f19577c == 0 ? numberFormat.format(Integer.valueOf(hVar2.f19576b)) : "";
        NumberCircleView numberCircleView2 = dVar.f6488x;
        int i11 = hVar2.f19577c;
        j.b(str2);
        numberCircleView2.setDrawableInfo(i11, str2, this.f6477B.contains(Integer.valueOf(i10)));
    }

    @Override // E2.AbstractC0115c0
    public final F0 g(ViewGroup viewGroup, int i10) {
        int i11;
        if (i10 == 0) {
            i11 = R.layout.index_title_row;
        } else if (i10 == 1) {
            i11 = R.layout.index_header_row;
        } else if (i10 == 2) {
            i11 = R.layout.index_sura_row;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException("Invalid viewType detected.");
            }
            i11 = R.layout.index_quarter_row;
        }
        int i12 = h.f6492u;
        View viewInflate = this.f6482y.inflate(i11, viewGroup, false);
        j.d(viewInflate, "inflate(...)");
        if (i10 == 0) {
            return new e(viewInflate);
        }
        if (i10 == 1) {
            return new c(viewInflate);
        }
        if (i10 == 2) {
            return new g(viewInflate);
        }
        if (i10 == 3) {
            return new f(viewInflate);
        }
        throw new IllegalArgumentException("Invalid RowViewHolder type.");
    }

    @Override // E2.AbstractC0115c0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(h hVar, int i10) {
        J4.e eVar = (J4.e) this.f6476A.get(i10);
        boolean z10 = eVar instanceof J4.b;
        Context context = this.f6478u;
        if (z10) {
            e eVar2 = hVar instanceof e ? (e) hVar : null;
            if (eVar2 == null) {
                return;
            }
            eVar2.f6489v.setText(context.getResources().getString(R.string.contents));
            return;
        }
        int i11 = 0;
        if (eVar instanceof J4.a) {
            c cVar = hVar instanceof c ? (c) hVar : null;
            if (cVar == null) {
                return;
            }
            TextView textView = cVar.f6485w;
            J4.a aVar = (J4.a) eVar;
            p124m3.g gVar = aVar.f4323a;
            gVar.getClass();
            textView.setText(p125m4.b.b() ? gVar.f19569c : gVar.f19570d);
            cVar.f6484v.setOnClickListener(new a(this, aVar, i11));
            return;
        }
        boolean z11 = eVar instanceof J4.d;
        int i12 = 2;
        int i13 = 1;
        String[] strArr = this.f6483z;
        NumberFormat numberFormat = this.f6481x;
        if (z11) {
            g gVar2 = hVar instanceof g ? (g) hVar : null;
            if (gVar2 == null) {
                return;
            }
            p124m3.a aVar2 = ((J4.d) eVar).f4326a;
            gVar2.f6486v.setText(strArr[aVar2.f19527a]);
            gVar2.f6487w.setText(context.getString(R.string.sura_info_format, numberFormat.format(Integer.valueOf(aVar2.a().f19541b)), numberFormat.format(Integer.valueOf(aVar2.f19537m)), context.getString(aVar2.f19529c ? R.string.makki : R.string.madani)));
            NumberCircleView numberCircleView = gVar2.f6488x;
            String str = numberFormat.format(Integer.valueOf(aVar2.f19528b));
            j.d(str, "format(...)");
            numberCircleView.setDrawableInfo(0, str, this.f6477B.contains(Integer.valueOf(i10)));
            gVar2.f6491y.setOnClickListener(new a(this, aVar2, i13));
            return;
        }
        if (!(eVar instanceof J4.c)) {
            throw new A6.a();
        }
        f fVar = hVar instanceof f ? (f) hVar : null;
        if (fVar == null) {
            return;
        }
        p124m3.h hVar2 = ((J4.c) eVar).f4325a;
        TextView textView2 = fVar.f6486v;
        p124m3.j jVar = hVar2.g;
        int i14 = hVar2.f19577c;
        textView2.setText(v.P0(jVar.f19590f, "\uea78", ""));
        fVar.f6487w.setText(context.getString(R.string.quarter_info_format, strArr[jVar.f19595m - 1], numberFormat.format(Integer.valueOf(jVar.f19586b)), numberFormat.format(Integer.valueOf(jVar.c()))));
        fVar.f6490y.setOnClickListener(new a(this, hVar2, i12));
        String str2 = i14 == 0 ? numberFormat.format(Integer.valueOf(hVar2.f19576b)) : "";
        NumberCircleView numberCircleView2 = fVar.f6488x;
        j.b(str2);
        numberCircleView2.setDrawableInfo(i14, str2, this.f6477B.contains(Integer.valueOf(i10)));
    }
}
