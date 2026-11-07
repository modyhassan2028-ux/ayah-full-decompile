package p006a5;

import Z.X;
import com.ayah.common.data.source.json.model.booklist.BookType;
import java.util.ArrayList;
import java.util.List;
import p047e5.g;
import p047e5.i;
import p110k9.y;
import p120l9.m;
import p124m3.j;
import p241y9.a;
import p241y9.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f11193r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f11194s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f11195t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f11196u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ X f11197v;

    public /* synthetic */ c(g gVar, List list, f fVar, X x9) {
        this.f11193r = 0;
        this.f11196u = gVar;
        this.f11194s = list;
        this.f11195t = fVar;
        this.f11197v = x9;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f11193r) {
            case 0:
                g gVar = this.f11196u;
                boolean z10 = gVar.f15813d;
                BookType bookType = gVar.f15811b;
                if (z10) {
                    this.f11197v.setValue(Boolean.TRUE);
                } else {
                    ArrayList arrayList = new ArrayList();
                    List list = this.f11194s;
                    for (Object obj : list) {
                        if (obj instanceof i) {
                            arrayList.add(obj);
                        }
                    }
                    i iVar = (i) m.g0(arrayList);
                    j jVar = iVar != null ? iVar.f15819b : null;
                    if (jVar != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list) {
                            if (p251z9.j.a(((p047e5.j) obj2).f15822a, bookType)) {
                                arrayList2.add(obj2);
                            }
                        }
                        this.f11195t.d(jVar, bookType, arrayList2);
                    }
                }
                break;
            case 1:
                BookType bookType2 = this.f11196u.f15811b;
                this.f11197v.setValue(Boolean.FALSE);
                ArrayList arrayList3 = new ArrayList();
                List list2 = this.f11194s;
                for (Object obj3 : list2) {
                    if (obj3 instanceof i) {
                        arrayList3.add(obj3);
                    }
                }
                i iVar2 = (i) m.g0(arrayList3);
                j jVar2 = iVar2 != null ? iVar2.f15819b : null;
                if (jVar2 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj4 : list2) {
                        if (p251z9.j.a(((p047e5.j) obj4).f15822a, bookType2)) {
                            arrayList4.add(obj4);
                        }
                    }
                    this.f11195t.d(jVar2, bookType2, arrayList4);
                }
                break;
            default:
                BookType bookType3 = this.f11196u.f15811b;
                this.f11197v.setValue(Boolean.FALSE);
                ArrayList arrayList5 = new ArrayList();
                List list3 = this.f11194s;
                for (Object obj5 : list3) {
                    if (obj5 instanceof i) {
                        arrayList5.add(obj5);
                    }
                }
                i iVar3 = (i) m.g0(arrayList5);
                j jVar3 = iVar3 != null ? iVar3.f15819b : null;
                if (jVar3 != null) {
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj6 : list3) {
                        if (p251z9.j.a(((p047e5.j) obj6).f15822a, bookType3)) {
                            arrayList6.add(obj6);
                        }
                    }
                    this.f11195t.d(jVar3, bookType3, arrayList6);
                }
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ c(List list, f fVar, g gVar, X x9, int i10) {
        this.f11193r = i10;
        this.f11194s = list;
        this.f11195t = fVar;
        this.f11196u = gVar;
        this.f11197v = x9;
    }
}
