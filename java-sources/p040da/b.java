package p040da;

import R6.g;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f15707a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15709c;

    @Override // p040da.a
    public final void a(p052ea.b bVar) {
        ArrayList arrayList = this.f15707a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((a) arrayList.get(i10)).a(bVar);
        }
    }

    @Override // p040da.a
    public final void b(p052ea.b bVar) {
        ArrayList arrayList = this.f15707a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((a) arrayList.get(i10)).b(bVar);
        }
    }

    @Override // p040da.a
    public final void c(p052ea.b bVar, long j, long j10, int i10) {
        long j11 = j;
        long j12 = j10;
        int i11 = (int) (((j11 * 1.0d) * 100.0d) / (j12 * 1.0d));
        String str = bVar.f15866r;
        if (str.equals(this.f15708b) && i11 == this.f15709c) {
            return;
        }
        ArrayList arrayList = this.f15707a;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            ((a) arrayList.get(i12)).c(bVar, j11, j12, i10);
            i12++;
            j11 = j;
            j12 = j10;
        }
        this.f15708b = str;
        this.f15709c = i11;
    }

    @Override // p040da.a
    public final void d(p052ea.b bVar) {
        ArrayList arrayList = this.f15707a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((a) arrayList.get(i10)).d(bVar);
        }
        this.f15708b = "";
    }

    @Override // p040da.a
    public final void e(p052ea.b bVar, g gVar) {
        ArrayList arrayList = this.f15707a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((a) arrayList.get(i10)).e(bVar, gVar);
        }
        this.f15708b = "";
    }

    @Override // p040da.a
    public final void f(p052ea.b bVar) {
        ArrayList arrayList = this.f15707a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((a) arrayList.get(i10)).f(bVar);
        }
    }
}
