package p116l5;

import A6.a;
import H9.o;
import H9.v;
import K9.AbstractC0405x;
import android.content.Context;
import android.content.Intent;
import com.ayah.R;
import com.ayah.common.data.source.json.model.booklist.BookType;
import com.ayah.feature.library.view.LibraryComposePage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p047e5.d;
import p047e5.g;
import p047e5.i;
import p107k5.e;
import p110k9.y;
import p120l9.l;
import p120l9.m;
import p120l9.n;
import p123m2.c;
import p124m3.j;
import p241y9.f;
import p251z9.h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b extends h implements f {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f19389z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, Object obj, Class cls, String str, String str2, int i11, int i12, int i13) {
        super(i10, obj, cls, str, str2, i11, i12);
        this.f19389z = i13;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i10 = this.f19389z;
        y yVar = y.f19095a;
        Object obj4 = this.f24870s;
        switch (i10) {
            case 0:
                j jVar = (j) obj;
                BookType bookType = (BookType) obj2;
                List list = (List) obj3;
                p251z9.j.e(jVar, "p0");
                p251z9.j.e(bookType, "p1");
                p251z9.j.e(list, "p2");
                LibraryComposePage libraryComposePage = (LibraryComposePage) obj4;
                int i11 = LibraryComposePage.f13804x;
                e libraryPagePresenter = libraryComposePage.getLibraryPagePresenter();
                Context context = libraryComposePage.getContext();
                p251z9.j.d(context, "getContext(...)");
                libraryPagePresenter.getClass();
                String strT = c.t("﴿", jVar.f19587c, "﴾ [", jVar.d(context), "]");
                ArrayList arrayList = new ArrayList(n.a0(list, 10));
                Iterator it = list.iterator();
                while (true) {
                    String str = "";
                    if (!it.hasNext()) {
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj5 = arrayList.get(i12);
                            i12++;
                            if (!o.e1((String) obj5)) {
                                arrayList2.add(obj5);
                            }
                        }
                        String strN0 = l.n0("\n", new String[]{strT, v.P0(m.l0(arrayList2, "\n", null, null, null, 62), "*", ""), c.s("- ", bookType.f13691h)});
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", strN0);
                        libraryComposePage.getContext().startActivity(Intent.createChooser(intent, libraryComposePage.getContext().getString(R.string.share)));
                        return yVar;
                    }
                    p047e5.j jVar2 = (p047e5.j) it.next();
                    p251z9.j.e(jVar2, "<this>");
                    if (!(jVar2 instanceof i) && !(jVar2 instanceof g) && !(jVar2 instanceof p047e5.e)) {
                        if (jVar2 instanceof d) {
                            str = ((d) jVar2).f15799b.f19992b;
                        } else if (jVar2 instanceof p047e5.h) {
                            str = ((p047e5.h) jVar2).f15815b.f19997b;
                        } else if (jVar2 instanceof p047e5.c) {
                            str = ((p047e5.c) jVar2).f15795b.f19989b;
                        } else if (!(jVar2 instanceof p047e5.f) && !(jVar2 instanceof p047e5.b)) {
                            throw new a();
                        }
                    }
                    arrayList.add(str);
                }
                break;
            default:
                j jVar3 = (j) obj;
                BookType bookType2 = (BookType) obj2;
                List list2 = (List) obj3;
                p251z9.j.e(jVar3, "p0");
                p251z9.j.e(bookType2, "p1");
                p251z9.j.e(list2, "p2");
                LibraryComposePage libraryComposePage2 = (LibraryComposePage) obj4;
                AbstractC0405x.x(libraryComposePage2.f13805t, null, new c(libraryComposePage2, list2, jVar3, bookType2, (p150o9.c) null), 3);
                return yVar;
        }
    }
}
