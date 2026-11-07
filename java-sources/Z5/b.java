package Z5;

import E2.F0;
import E2.T;
import Y3.m;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ayah.R;
import com.ayah.feature.tafsir.view.TafsirChapterHeaderView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import java.util.List;
import p007a6.i;
import p110k9.o;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends T {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f11007v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LayoutInflater f11008w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p106k4.a f11009x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final E5.a f11010y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o f11011z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(float f3, LayoutInflater layoutInflater, p106k4.a aVar, E5.a aVar2) {
        super(new B5.c(1));
        j.e(aVar, "ayahTextFormatter");
        this.f11007v = f3;
        this.f11008w = layoutInflater;
        this.f11009x = aVar;
        this.f11010y = aVar2;
        this.f11011z = p110k9.a.d(new B3.f(8, this));
    }

    @Override // E2.AbstractC0115c0
    public final int a() {
        return this.f1623u.f1666f.size();
    }

    @Override // E2.AbstractC0115c0
    public final int c(int i10) {
        Object obj = this.f1623u.f1666f.get(i10);
        j.d(obj, "get(...)");
        i iVar = (i) obj;
        if (iVar instanceof p007a6.h) {
            return 3;
        }
        if (iVar instanceof p007a6.b) {
            return 2;
        }
        if (iVar instanceof p007a6.a) {
            return 0;
        }
        if (iVar instanceof p007a6.e) {
            return 1;
        }
        if (iVar instanceof p007a6.g) {
            return 4;
        }
        if (iVar instanceof p007a6.d) {
            return 5;
        }
        if (iVar instanceof p007a6.f) {
            return 6;
        }
        if (iVar instanceof p007a6.c) {
            return 7;
        }
        throw new A6.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // E2.AbstractC0115c0
    public final void e(F0 f3, int i10) {
        TextView textView;
        String str;
        TextView textView2;
        ShapeDrawable shapeDrawableK;
        TafsirChapterHeaderView tafsirChapterHeaderView;
        TextView textView3;
        h hVar = (h) f3;
        View view = hVar.f1486a;
        List list = this.f1623u.f1666f;
        j.d(list, "getCurrentList(...)");
        i iVar = (i) list.get(i10);
        if (iVar instanceof p007a6.a) {
            return;
        }
        if (iVar instanceof p007a6.g) {
            f fVar = hVar instanceof f ? (f) hVar : null;
            if (fVar == null || (textView3 = fVar.f11019w) == null) {
                return;
            }
            Context context = view.getContext();
            j.d(context, "getContext(...)");
            p134n3.g gVar = ((p007a6.g) iVar).f11219b;
            textView3.setText(this.f11009x.a(context, gVar.f19997b, gVar.f20000e, gVar.f20001f));
            return;
        }
        if ((iVar instanceof p007a6.e) || (iVar instanceof p007a6.d)) {
            f fVar2 = hVar instanceof f ? (f) hVar : null;
            if (fVar2 == null || (textView = fVar2.f11019w) == null) {
                return;
            }
            p134n3.i iVar2 = iVar.f11226a;
            j.e(iVar2, "<this>");
            if (iVar2 instanceof p134n3.e) {
                str = ((p134n3.e) iVar2).f19992b;
            } else if (iVar2 instanceof p134n3.g) {
                str = ((p134n3.g) iVar2).f19997b;
            } else {
                str = iVar2 instanceof p134n3.d ? ((p134n3.d) iVar2).f19989b : "";
            }
            textView.setText(str);
            return;
        }
        if (iVar instanceof p007a6.b) {
            d dVar = hVar instanceof d ? (d) hVar : null;
            if (dVar == null || (tafsirChapterHeaderView = dVar.f11014w) == null) {
                return;
            }
            p007a6.b bVar = (p007a6.b) iVar;
            tafsirChapterHeaderView.setShouldSelect(bVar.f11206d instanceof p115l4.a);
            tafsirChapterHeaderView.setSuraName(bVar.f11205c.g);
            return;
        }
        if (iVar instanceof p007a6.h) {
            g gVar2 = hVar instanceof g ? (g) hVar : null;
            if (gVar2 != null) {
                View view2 = gVar2.f11020v;
                p007a6.h hVar2 = (p007a6.h) iVar;
                p124m3.j jVar = hVar2.f11222c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jVar.f19590f);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) "  ");
                float f7 = 23 * this.f11007v;
                int i11 = (int) (((double) f7) * 0.85d);
                float f10 = i11;
                Context context2 = view2.getContext();
                j.d(context2, "getContext(...)");
                m mVar = new m(context2, jVar, hVar2.f11223d);
                mVar.a(f7);
                mVar.setBounds(0, 0, i11, (int) (1.3333334f * f10));
                spannableStringBuilder.setSpan(new p089i4.a(mVar, f10 * (-0.35f)), length + 1, spannableStringBuilder.length(), 17);
                gVar2.f11021w.setText(spannableStringBuilder);
                p050e8.b bVar2 = hVar2.f11224e;
                if (bVar2 instanceof Y3.a) {
                    shapeDrawableK = k(((Y3.a) bVar2).f10389e);
                } else if (bVar2.equals(Y3.c.f10391e) || bVar2.equals(Y3.b.f10390e)) {
                    shapeDrawableK = k(R.color.tint_highlight);
                } else if (bVar2.equals(Y3.d.f10392e) || bVar2.equals(Y3.e.f10393e)) {
                    shapeDrawableK = null;
                } else {
                    if (!bVar2.equals(Y3.f.f10394e)) {
                        throw new A6.a();
                    }
                    shapeDrawableK = k(R.color.quran_selection);
                }
                view2.setBackground(shapeDrawableK);
                return;
            }
            return;
        }
        if (iVar instanceof p007a6.f) {
            Context context3 = view.getContext();
            f fVar3 = hVar instanceof f ? (f) hVar : null;
            if (fVar3 == null || (textView2 = fVar3.f11019w) == null) {
                return;
            }
            p124m3.j jVar2 = ((p007a6.f) iVar).f11217c;
            Context context4 = view.getContext();
            j.d(context4, "getContext(...)");
            textView2.setText(context3.getString(R.string.ayah_reference, jVar2.d(context4)));
            return;
        }
        if (!(iVar instanceof p007a6.c)) {
            throw new A6.a();
        }
        e eVar = hVar instanceof e ? (e) hVar : null;
        if (eVar != null) {
            View view3 = eVar.f11015v;
            ImageView imageView = eVar.f11016w;
            CircularProgressIndicator circularProgressIndicator = eVar.f11017x;
            p007a6.c cVar = (p007a6.c) iVar;
            boolean z10 = cVar.f11210d;
            int i12 = cVar.f11209c;
            if (i12 == -1 && !z10) {
                imageView.setVisibility(0);
                circularProgressIndicator.setVisibility(8);
                view3.setOnClickListener(new O4.a(this, cVar, 3));
            } else {
                circularProgressIndicator.setProgress(Math.max(i12, 0));
                imageView.setVisibility(8);
                circularProgressIndicator.setIndeterminate(z10);
                circularProgressIndicator.setVisibility(0);
                view3.setOnClickListener(null);
            }
        }
    }

    @Override // E2.AbstractC0115c0
    public final void f(F0 f3, int i10, List list) {
        h hVar = (h) f3;
        j.e(list, "payloads");
        if (list.isEmpty()) {
            e(hVar, i10);
            return;
        }
        Object objM0 = p120l9.m.m0(list);
        e eVar = hVar instanceof e ? (e) hVar : null;
        if (eVar != null) {
            CircularProgressIndicator circularProgressIndicator = eVar.f11017x;
            if ((objM0 instanceof a ? (a) objM0 : null) != null) {
                eVar.f11016w.setVisibility(8);
                circularProgressIndicator.setVisibility(0);
                a aVar = (a) objM0;
                circularProgressIndicator.setIndeterminate(aVar.f11006b);
                circularProgressIndicator.setProgress(Math.max(aVar.f11005a, 0));
                eVar.f11015v.setOnClickListener(null);
            }
        }
    }

    @Override // E2.AbstractC0115c0
    public final F0 g(ViewGroup viewGroup, int i10) {
        int i11;
        switch (i10) {
            case 0:
                i11 = R.layout.tafsir_row_basmalah;
                break;
            case 1:
                i11 = R.layout.tafsir_row_header;
                break;
            case 2:
                i11 = R.layout.tafsir_row_chapter_header;
                break;
            case 3:
                i11 = R.layout.tafsir_row_verse;
                break;
            case 4:
                i11 = R.layout.tafsir_row_text;
                break;
            case 5:
                i11 = R.layout.tafsir_row_footnote;
                break;
            case 6:
                i11 = R.layout.tafsir_row_reference;
                break;
            case 7:
                i11 = R.layout.tafsir_row_downloading;
                break;
            default:
                throw new IllegalArgumentException("Invalid tafsir row type");
        }
        int i12 = h.f11022u;
        View viewInflate = this.f11008w.inflate(i11, viewGroup, false);
        j.d(viewInflate, "inflate(...)");
        switch (i10) {
            case 0:
                return new c(viewInflate);
            case 1:
                return new f(viewInflate);
            case 2:
                return new d(viewInflate);
            case 3:
                return new g(viewInflate);
            case 4:
                return new f(viewInflate);
            case 5:
                return new f(viewInflate);
            case 6:
                return new f(viewInflate);
            case 7:
                return new e(viewInflate);
            default:
                throw new IllegalArgumentException("Invalid tafsir row type");
        }
    }

    public final ShapeDrawable k(int i10) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(((RoundRectShape) this.f11011z.getValue()).clone());
        shapeDrawable.setColorFilter(new PorterDuffColorFilter(this.f11008w.getContext().getColor(i10), PorterDuff.Mode.SRC_IN));
        return shapeDrawable;
    }
}
