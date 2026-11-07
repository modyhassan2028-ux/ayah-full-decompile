package N5;

import java.util.ArrayList;
import java.util.List;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p125m4.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f6030f;
    public final List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ArrayList arrayList, List list) {
        super(arrayList, list);
        j.e(arrayList, "previous");
        j.e(list, "updated");
        this.f6030f = arrayList;
        this.g = list;
    }

    @Override // p125m4.a, E2.AbstractC0114c
    public final boolean c(int i10, int i11) {
        O5.d dVar = (O5.d) this.f6030f.get(i10);
        O5.d dVar2 = (O5.d) this.g.get(i11);
        if ((dVar instanceof O5.c) && (dVar2 instanceof O5.c)) {
            return j.a(((O5.c) dVar).f6495a, ((O5.c) dVar2).f6495a);
        }
        return (dVar instanceof O5.a) && (dVar2 instanceof O5.a) && ((O5.a) dVar).f6493a == ((O5.a) dVar2).f6493a;
    }

    @Override // p125m4.a, E2.AbstractC0114c
    public final Object i(int i10, int i11) {
        O5.d dVar = (O5.d) this.f6030f.get(i10);
        O5.d dVar2 = (O5.d) this.g.get(i11);
        if ((dVar instanceof O5.c) && (dVar2 instanceof O5.c) && (((O5.c) dVar).f6497c instanceof p088i3.a) && (((O5.c) dVar2).f6497c instanceof p088i3.a)) {
            return "DownloadStatus";
        }
        return null;
    }
}
