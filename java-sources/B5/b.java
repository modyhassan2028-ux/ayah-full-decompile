package B5;

import E2.F0;
import E2.T;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ayah.R;
import com.ayah.common.data.source.json.model.booklist.BookType;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import java.util.List;
import p120l9.m;
import p251z9.j;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class b extends T {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LayoutInflater f628v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final E5.c f629w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final E5.a f630x;

    public b(LayoutInflater layoutInflater, E5.c cVar, E5.a aVar) {
        super(new c(0));
        this.f628v = layoutInflater;
        this.f629w = cVar;
        this.f630x = aVar;
    }

    @Override // E2.AbstractC0115c0
    public final int a() {
        return this.f1623u.f1666f.size();
    }

    @Override // E2.AbstractC0115c0
    public final int c(int i10) {
        Object obj = this.f1623u.f1666f.get(i10);
        j.d(obj, "get(...)");
        C5.c cVar = (C5.c) obj;
        if (cVar instanceof C5.a) {
            return 0;
        }
        if (cVar instanceof C5.b) {
            return 1;
        }
        throw new A6.a();
    }

    @Override // E2.AbstractC0115c0
    public final void e(F0 f3, int i10) {
        f fVar = (f) f3;
        List list = this.f1623u.f1666f;
        j.d(list, "getCurrentList(...)");
        C5.c cVar = (C5.c) list.get(i10);
        if (cVar instanceof C5.a) {
            ((d) fVar).f633w.setText(((C5.a) cVar).f756a.f13682b);
            return;
        }
        if (!(cVar instanceof C5.b)) {
            throw new A6.a();
        }
        e eVar = (e) fVar;
        View view = eVar.f638y;
        CircularProgressIndicator circularProgressIndicator = eVar.f634A;
        View view2 = eVar.f639z;
        TextView textView = eVar.f636w;
        final C5.b bVar = (C5.b) cVar;
        g gVar = bVar.f759c;
        BookType bookType = bVar.f757a;
        textView.setText(bookType.f13687c);
        eVar.f637x.setText(bookType.f13688d);
        if (bVar.f758b) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        if (gVar.equals(C5.d.f760c)) {
            view2.setVisibility(8);
            circularProgressIndicator.setVisibility(8);
        } else if (gVar instanceof C5.e) {
            view2.setVisibility(8);
            circularProgressIndicator.setVisibility(0);
            circularProgressIndicator.setProgress(((C5.e) gVar).f761c);
        } else {
            if (!gVar.equals(C5.f.f763c)) {
                throw new A6.a();
            }
            view2.setVisibility(0);
            circularProgressIndicator.setVisibility(8);
            final int i11 = 0;
            view2.setOnClickListener(new View.OnClickListener(this) { // from class: B5.a

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ b f626s;

                {
                    this.f626s = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i11) {
                        case 0:
                            this.f626s.f629w.e(bVar.f757a);
                            break;
                        default:
                            this.f626s.f630x.e(bVar.f757a);
                            break;
                    }
                }
            });
        }
        final int i12 = 1;
        eVar.f635v.setOnClickListener(new View.OnClickListener(this) { // from class: B5.a

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ b f626s;

            {
                this.f626s = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i12) {
                    case 0:
                        this.f626s.f629w.e(bVar.f757a);
                        break;
                    default:
                        this.f626s.f630x.e(bVar.f757a);
                        break;
                }
            }
        });
    }

    @Override // E2.AbstractC0115c0
    public final void f(F0 f3, int i10, List list) {
        f fVar = (f) f3;
        j.e(list, "payloads");
        if (list.isEmpty()) {
            e(fVar, i10);
            return;
        }
        Object objM0 = m.m0(list);
        e eVar = fVar instanceof e ? (e) fVar : null;
        if (eVar != null) {
            CircularProgressIndicator circularProgressIndicator = eVar.f634A;
            Integer num = objM0 instanceof Integer ? (Integer) objM0 : null;
            if (num != null) {
                int iIntValue = num.intValue();
                eVar.f639z.setVisibility(8);
                circularProgressIndicator.setVisibility(0);
                circularProgressIndicator.setProgress(iIntValue);
            }
        }
    }

    @Override // E2.AbstractC0115c0
    public final F0 g(ViewGroup viewGroup, int i10) {
        int i11;
        if (i10 == 0) {
            i11 = R.layout.choose_book_row_header;
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException("Invalid edit library row type");
            }
            i11 = R.layout.choose_book_row_tafsir;
        }
        int i12 = f.f640u;
        View viewInflate = this.f628v.inflate(i11, viewGroup, false);
        j.d(viewInflate, "inflate(...)");
        if (i10 == 0) {
            return new d(viewInflate);
        }
        if (i10 == 1) {
            return new e(viewInflate);
        }
        throw new IllegalArgumentException("Invalid edit library row type");
    }
}
