package p033d0;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f15529t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f15530u;

    public d(Object[] objArr, int i10, int i11) {
        super(i10, i11);
        this.f15530u = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f15529t) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f15530u;
                int i10 = this.f15525r;
                this.f15525r = i10 + 1;
                return objArr[i10];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f15525r++;
                return this.f15530u;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f15529t) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f15530u;
                int i10 = this.f15525r - 1;
                this.f15525r = i10;
                return objArr[i10];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f15525r--;
                return this.f15530u;
        }
    }

    public d(int i10, Object obj) {
        super(i10, 1);
        this.f15530u = obj;
    }
}
