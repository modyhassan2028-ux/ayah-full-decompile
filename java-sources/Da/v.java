package Da;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f1401a = new u(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f1402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f1403c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f1402b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f1403c = atomicReferenceArr;
    }

    public static final void a(u uVar) {
        p251z9.j.e(uVar, "segment");
        if (uVar.f1400f != null || uVar.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (uVar.f1398d) {
            return;
        }
        AtomicReference atomicReference = f1403c[(int) (Thread.currentThread().getId() & (((long) f1402b) - 1))];
        u uVar2 = f1401a;
        u uVar3 = (u) atomicReference.getAndSet(uVar2);
        if (uVar3 == uVar2) {
            return;
        }
        int i10 = uVar3 != null ? uVar3.f1397c : 0;
        if (i10 >= 65536) {
            atomicReference.set(uVar3);
            return;
        }
        uVar.f1400f = uVar3;
        uVar.f1396b = 0;
        uVar.f1397c = i10 + 8192;
        atomicReference.set(uVar);
    }

    public static final u b() {
        AtomicReference atomicReference = f1403c[(int) (Thread.currentThread().getId() & (((long) f1402b) - 1))];
        u uVar = f1401a;
        u uVar2 = (u) atomicReference.getAndSet(uVar);
        if (uVar2 == uVar) {
            return new u();
        }
        if (uVar2 == null) {
            atomicReference.set(null);
            return new u();
        }
        atomicReference.set(uVar2.f1400f);
        uVar2.f1400f = null;
        uVar2.f1397c = 0;
        return uVar2;
    }
}
