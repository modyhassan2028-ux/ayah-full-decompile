package p116l5;

import K9.AbstractC0405x;
import K9.H;
import K9.InterfaceC0402u;
import R9.d;
import android.content.Context;
import android.graphics.Bitmap;
import com.ayah.common.data.source.json.model.booklist.BookType;
import com.ayah.feature.library.view.LibraryComposePage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p047e5.h;
import p110k9.y;
import p120l9.n;
import p124m3.j;
import p134n3.g;
import p161p9.a;
import p241y9.e;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f19390r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f19391s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ LibraryComposePage f19392t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f19393u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j f19394v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BookType f19395w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LibraryComposePage libraryComposePage, List list, j jVar, BookType bookType, p150o9.c cVar) {
        super(2, cVar);
        this.f19392t = libraryComposePage;
        this.f19393u = list;
        this.f19394v = jVar;
        this.f19395w = bookType;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f19390r) {
            case 0:
                return new c(this.f19393u, this.f19392t, this.f19394v, this.f19395w, cVar);
            default:
                return new c(this.f19392t, this.f19393u, this.f19394v, this.f19395w, cVar);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f19390r) {
            case 0:
                break;
        }
        return ((c) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.List] */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) throws IOException {
        Object objI;
        int i10 = this.f19390r;
        LibraryComposePage libraryComposePage = this.f19392t;
        a aVar = a.f21156r;
        switch (i10) {
            case 0:
                int i11 = this.f19391s;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return obj;
                }
                p110k9.a.e(obj);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : this.f19393u) {
                    if (obj2 instanceof h) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(n.a0(arrayList, 10));
                int size = arrayList.size();
                int i12 = 0;
                while (true) {
                    BookType bookType = this.f19395w;
                    if (i12 >= size) {
                        p046e4.e shareUtil = libraryComposePage.getShareUtil();
                        Context context = libraryComposePage.getContext();
                        p251z9.j.d(context, "getContext(...)");
                        j jVar = this.f19394v;
                        int i13 = jVar.f19596n.f19528b;
                        int i14 = jVar.f19586b;
                        String str = bookType.f13687c;
                        this.f19391s = 1;
                        shareUtil.getClass();
                        R9.e eVar = H.f5322a;
                        Object objI2 = AbstractC0405x.I(d.f7436t, new p046e4.c(shareUtil, context, i13, i14, i14, str, arrayList2, null), this);
                        return objI2 == aVar ? aVar : objI2;
                    }
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    h hVar = (h) obj3;
                    p251z9.j.e(hVar, "<this>");
                    g gVar = hVar.f15815b;
                    arrayList2.add(new p066g4.a(gVar.f19997b, gVar.f20000e, bookType.g));
                }
                break;
            default:
                int i15 = this.f19391s;
                if (i15 == 0) {
                    p110k9.a.e(obj);
                    R9.e eVar2 = H.f5322a;
                    d dVar = d.f7436t;
                    c cVar = new c(this.f19393u, this.f19392t, this.f19394v, this.f19395w, (p150o9.c) null);
                    this.f19391s = 1;
                    objI = AbstractC0405x.I(dVar, cVar, this);
                    if (objI == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    objI = obj;
                }
                Context context2 = libraryComposePage.getContext();
                p251z9.j.d(context2, "getContext(...)");
                p017b7.g.n0(context2, (Bitmap) objI);
                return y.f19095a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List list, LibraryComposePage libraryComposePage, j jVar, BookType bookType, p150o9.c cVar) {
        super(2, cVar);
        this.f19393u = list;
        this.f19392t = libraryComposePage;
        this.f19394v = jVar;
        this.f19395w = bookType;
    }
}
