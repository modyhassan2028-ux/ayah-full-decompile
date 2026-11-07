package j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j$.sun.misc.a f18120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f18121i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f18122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile r f18123f;
    public volatile Thread g;
    volatile int lockState;

    static {
        j$.sun.misc.a aVar = j$.sun.misc.a.f17734b;
        f18120h = aVar;
        f18121i = aVar.h(q.class, "lockState");
    }

    public static int i(Object obj, Object obj2) {
        int iCompareTo;
        if (obj == null || obj2 == null || (iCompareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) {
            return System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1;
        }
        return iCompareTo;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004b A[PHI: r7
      0x004b: PHI (r7v3 java.lang.Class<?>) = (r7v2 java.lang.Class<?>), (r7v4 java.lang.Class<?>) binds: [B:24:0x0049, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    public q(r rVar) {
        int i10;
        super(-2, null, null);
        this.f18123f = rVar;
        r rVar2 = null;
        while (rVar != null) {
            r rVar3 = (r) rVar.f18108d;
            rVar.g = null;
            rVar.f18125f = null;
            if (rVar2 == null) {
                rVar.f18124e = null;
                rVar.f18127i = false;
            } else {
                Object obj = rVar.f18106b;
                int i11 = rVar.f18105a;
                r rVar4 = rVar2;
                Class<?> clsC = null;
                while (true) {
                    Object obj2 = rVar4.f18106b;
                    int i12 = rVar4.f18105a;
                    if (i12 > i11) {
                        i10 = -1;
                    } else if (i12 < i11) {
                        i10 = 1;
                    } else if (clsC != null || (clsC = ConcurrentHashMap.c(obj)) != null) {
                        int i13 = ConcurrentHashMap.g;
                        int iCompareTo = (obj2 == null || obj2.getClass() != clsC) ? 0 : ((Comparable) obj).compareTo(obj2);
                        if (iCompareTo == 0) {
                            i10 = i(obj, obj2);
                        } else {
                            i10 = iCompareTo;
                        }
                    } else {
                        i10 = i(obj, obj2);
                    }
                    r rVar5 = i10 <= 0 ? rVar4.f18125f : rVar4.g;
                    if (rVar5 == null) {
                        break;
                    } else {
                        rVar4 = rVar5;
                    }
                }
                rVar.f18124e = rVar4;
                if (i10 <= 0) {
                    rVar4.f18125f = rVar;
                } else {
                    rVar4.g = rVar;
                }
                rVar = c(rVar2, rVar);
            }
            rVar2 = rVar;
            rVar = rVar3;
        }
        this.f18122e = rVar2;
    }

    public final void d() {
        if (f18120h.c(this, f18121i, 0, 1)) {
            return;
        }
        boolean z10 = false;
        while (true) {
            int i10 = this.lockState;
            if ((i10 & (-3)) == 0) {
                if (f18120h.c(this, f18121i, i10, 1)) {
                    break;
                }
            } else if ((i10 & 2) == 0) {
                if (f18120h.c(this, f18121i, i10, i10 | 2)) {
                    this.g = Thread.currentThread();
                    z10 = true;
                }
            } else if (z10) {
                LockSupport.park(this);
            }
        }
        if (z10) {
            this.g = null;
        }
    }

    @Override // j$.util.concurrent.l
    public final l a(int i10, Object obj) {
        Object obj2;
        Thread thread;
        l lVar = this.f18123f;
        while (true) {
            r rVarB = null;
            if (lVar == null) {
                return null;
            }
            int i11 = this.lockState;
            if ((i11 & 3) != 0) {
                if (lVar.f18105a == i10 && ((obj2 = lVar.f18106b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return lVar;
                }
                lVar = lVar.f18108d;
            } else if (f18120h.c(this, f18121i, i11, i11 + 4)) {
                try {
                    r rVar = this.f18122e;
                    if (rVar != null) {
                        rVarB = rVar.b(i10, obj, null);
                    }
                    return rVarB;
                } finally {
                    if (f18120h.e(this, f18121i) == 6 && (thread = this.g) != null) {
                        LockSupport.unpark(thread);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x0075  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9 A[LOOP:0: B:3:0x0007->B:65:0x00a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0079 A[SYNTHETIC] */
    public final r e(int i10, Object obj, Object obj2) {
        int i11;
        int i12;
        r rVarB;
        r rVarB2;
        r rVar;
        r rVar2;
        r rVar3;
        r rVar4 = this.f18122e;
        Class<?> clsC = null;
        boolean z10 = false;
        while (rVar4 != null) {
            int i13 = rVar4.f18105a;
            if (i13 > i10) {
                i12 = -1;
            } else {
                if (i13 < i10) {
                    i11 = 1;
                } else {
                    Object obj3 = rVar4.f18106b;
                    if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                        return rVar4;
                    }
                    if (clsC != null || (clsC = ConcurrentHashMap.c(obj)) != null) {
                        int i14 = ConcurrentHashMap.g;
                        int iCompareTo = (obj3 == null || obj3.getClass() != clsC) ? 0 : ((Comparable) obj).compareTo(obj3);
                        if (iCompareTo != 0) {
                            i11 = iCompareTo;
                        }
                    }
                    if (!z10) {
                        r rVar5 = rVar4.f18125f;
                        if (rVar5 != null && (rVarB2 = rVar5.b(i10, obj, clsC)) != null) {
                            return rVarB2;
                        }
                        r rVar6 = rVar4.g;
                        if (rVar6 != null && (rVarB = rVar6.b(i10, obj, clsC)) != null) {
                            return rVarB;
                        }
                        z10 = true;
                    }
                    i12 = i(obj, obj3);
                }
                if (i11 <= 0) {
                    rVar = rVar4.f18125f;
                } else {
                    rVar = rVar4.g;
                }
                if (rVar == null) {
                    rVar2 = this.f18123f;
                    rVar3 = new r(i10, obj, obj2, rVar2, rVar4);
                    this.f18123f = rVar3;
                    if (rVar2 != null) {
                        rVar2.f18126h = rVar3;
                    }
                    if (i11 <= 0) {
                        rVar4.f18125f = rVar3;
                    } else {
                        rVar4.g = rVar3;
                    }
                    if (!rVar4.f18127i) {
                        rVar3.f18127i = true;
                        return null;
                    }
                    d();
                    try {
                        this.f18122e = c(this.f18122e, rVar3);
                        return null;
                    } finally {
                        this.lockState = 0;
                    }
                }
                rVar4 = rVar;
            }
            i11 = i12;
            if (i11 <= 0) {
                rVar = rVar4.f18125f;
            } else {
                rVar = rVar4.g;
            }
            if (rVar == null) {
                rVar2 = this.f18123f;
                rVar3 = new r(i10, obj, obj2, rVar2, rVar4);
                this.f18123f = rVar3;
                if (rVar2 != null) {
                    rVar2.f18126h = rVar3;
                }
                if (i11 <= 0) {
                    rVar4.f18125f = rVar3;
                } else {
                    rVar4.g = rVar3;
                }
                if (!rVar4.f18127i) {
                    rVar3.f18127i = true;
                    return null;
                }
                d();
                this.f18122e = c(this.f18122e, rVar3);
                return null;
            }
            rVar4 = rVar;
        }
        r rVar7 = new r(i10, obj, obj2, null, null);
        this.f18122e = rVar7;
        this.f18123f = rVar7;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x008e A[PHI: r0
      0x008e: PHI (r0v4 j$.util.concurrent.r) = (r0v3 j$.util.concurrent.r), (r0v12 j$.util.concurrent.r) binds: [B:55:0x008a, B:51:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean f(r rVar) {
        r rVar2;
        r rVar3;
        r rVar4 = (r) rVar.f18108d;
        r rVar5 = rVar.f18126h;
        if (rVar5 == null) {
            this.f18123f = rVar4;
        } else {
            rVar5.f18108d = rVar4;
        }
        if (rVar4 != null) {
            rVar4.f18126h = rVar5;
        }
        if (this.f18123f == null) {
            this.f18122e = null;
            return true;
        }
        r rVarB = this.f18122e;
        if (rVarB == null || rVarB.g == null || (rVar2 = rVarB.f18125f) == null || rVar2.f18125f == null) {
            return true;
        }
        d();
        try {
            r rVar6 = rVar.f18125f;
            r rVar7 = rVar.g;
            if (rVar6 != null && rVar7 != null) {
                r rVar8 = rVar7;
                while (true) {
                    r rVar9 = rVar8.f18125f;
                    if (rVar9 == null) {
                        break;
                    }
                    rVar8 = rVar9;
                }
                boolean z10 = rVar8.f18127i;
                rVar8.f18127i = rVar.f18127i;
                rVar.f18127i = z10;
                r rVar10 = rVar8.g;
                r rVar11 = rVar.f18124e;
                if (rVar8 == rVar7) {
                    rVar.f18124e = rVar8;
                    rVar8.g = rVar;
                } else {
                    r rVar12 = rVar8.f18124e;
                    rVar.f18124e = rVar12;
                    if (rVar12 != null) {
                        if (rVar8 == rVar12.f18125f) {
                            rVar12.f18125f = rVar;
                        } else {
                            rVar12.g = rVar;
                        }
                    }
                    rVar8.g = rVar7;
                    rVar7.f18124e = rVar8;
                }
                rVar.f18125f = null;
                rVar.g = rVar10;
                if (rVar10 != null) {
                    rVar10.f18124e = rVar;
                }
                rVar8.f18125f = rVar6;
                rVar6.f18124e = rVar8;
                rVar8.f18124e = rVar11;
                if (rVar11 == null) {
                    rVarB = rVar8;
                } else if (rVar == rVar11.f18125f) {
                    rVar11.f18125f = rVar8;
                } else {
                    rVar11.g = rVar8;
                }
                if (rVar10 != null) {
                    rVar6 = rVar10;
                } else {
                    rVar6 = rVar;
                }
            } else if (rVar6 == null) {
                if (rVar7 != null) {
                    rVar6 = rVar7;
                } else {
                    rVar6 = rVar;
                }
            }
            if (rVar6 != rVar) {
                r rVar13 = rVar.f18124e;
                rVar6.f18124e = rVar13;
                if (rVar13 == null) {
                    rVarB = rVar6;
                } else if (rVar == rVar13.f18125f) {
                    rVar13.f18125f = rVar6;
                } else {
                    rVar13.g = rVar6;
                }
                rVar.f18124e = null;
                rVar.g = null;
                rVar.f18125f = null;
            }
            if (!rVar.f18127i) {
                rVarB = b(rVarB, rVar6);
            }
            this.f18122e = rVarB;
            if (rVar == rVar6 && (rVar3 = rVar.f18124e) != null) {
                if (rVar == rVar3.f18125f) {
                    rVar3.f18125f = null;
                } else if (rVar == rVar3.g) {
                    rVar3.g = null;
                }
                rVar.f18124e = null;
            }
            return false;
        } finally {
            this.lockState = 0;
        }
    }

    public static r g(r rVar, r rVar2) {
        r rVar3;
        if (rVar2 != null && (rVar3 = rVar2.g) != null) {
            r rVar4 = rVar3.f18125f;
            rVar2.g = rVar4;
            if (rVar4 != null) {
                rVar4.f18124e = rVar2;
            }
            r rVar5 = rVar2.f18124e;
            rVar3.f18124e = rVar5;
            if (rVar5 == null) {
                rVar3.f18127i = false;
                rVar = rVar3;
            } else if (rVar5.f18125f == rVar2) {
                rVar5.f18125f = rVar3;
            } else {
                rVar5.g = rVar3;
            }
            rVar3.f18125f = rVar2;
            rVar2.f18124e = rVar3;
        }
        return rVar;
    }

    public static r h(r rVar, r rVar2) {
        r rVar3;
        if (rVar2 != null && (rVar3 = rVar2.f18125f) != null) {
            r rVar4 = rVar3.g;
            rVar2.f18125f = rVar4;
            if (rVar4 != null) {
                rVar4.f18124e = rVar2;
            }
            r rVar5 = rVar2.f18124e;
            rVar3.f18124e = rVar5;
            if (rVar5 == null) {
                rVar3.f18127i = false;
                rVar = rVar3;
            } else if (rVar5.g == rVar2) {
                rVar5.g = rVar3;
            } else {
                rVar5.f18125f = rVar3;
            }
            rVar3.g = rVar2;
            rVar2.f18124e = rVar3;
        }
        return rVar;
    }

    public static r c(r rVar, r rVar2) {
        r rVar3;
        rVar2.f18127i = true;
        while (true) {
            r rVar4 = rVar2.f18124e;
            if (rVar4 == null) {
                rVar2.f18127i = false;
                return rVar2;
            }
            if (!rVar4.f18127i || (rVar3 = rVar4.f18124e) == null) {
                return rVar;
            }
            r rVar5 = rVar3.f18125f;
            if (rVar4 == rVar5) {
                r rVar6 = rVar3.g;
                if (rVar6 != null && rVar6.f18127i) {
                    rVar6.f18127i = false;
                    rVar4.f18127i = false;
                    rVar3.f18127i = true;
                    rVar2 = rVar3;
                } else {
                    if (rVar2 == rVar4.g) {
                        rVar = g(rVar, rVar4);
                        r rVar7 = rVar4.f18124e;
                        rVar3 = rVar7 == null ? null : rVar7.f18124e;
                        rVar4 = rVar7;
                        rVar2 = rVar4;
                    }
                    if (rVar4 != null) {
                        rVar4.f18127i = false;
                        if (rVar3 != null) {
                            rVar3.f18127i = true;
                            rVar = h(rVar, rVar3);
                        }
                    }
                }
            } else if (rVar5 != null && rVar5.f18127i) {
                rVar5.f18127i = false;
                rVar4.f18127i = false;
                rVar3.f18127i = true;
                rVar2 = rVar3;
            } else {
                if (rVar2 == rVar4.f18125f) {
                    rVar = h(rVar, rVar4);
                    r rVar8 = rVar4.f18124e;
                    rVar3 = rVar8 == null ? null : rVar8.f18124e;
                    rVar4 = rVar8;
                    rVar2 = rVar4;
                }
                if (rVar4 != null) {
                    rVar4.f18127i = false;
                    if (rVar3 != null) {
                        rVar3.f18127i = true;
                        rVar = g(rVar, rVar3);
                    }
                }
            }
        }
    }

    public static r b(r rVar, r rVar2) {
        while (rVar2 != null && rVar2 != rVar) {
            r rVar3 = rVar2.f18124e;
            if (rVar3 == null) {
                rVar2.f18127i = false;
                return rVar2;
            }
            if (rVar2.f18127i) {
                rVar2.f18127i = false;
                return rVar;
            }
            r rVar4 = rVar3.f18125f;
            if (rVar4 == rVar2) {
                r rVar5 = rVar3.g;
                if (rVar5 != null && rVar5.f18127i) {
                    rVar5.f18127i = false;
                    rVar3.f18127i = true;
                    rVar = g(rVar, rVar3);
                    rVar3 = rVar2.f18124e;
                    rVar5 = rVar3 == null ? null : rVar3.g;
                }
                if (rVar5 != null) {
                    r rVar6 = rVar5.f18125f;
                    r rVar7 = rVar5.g;
                    if ((rVar7 == null || !rVar7.f18127i) && (rVar6 == null || !rVar6.f18127i)) {
                        rVar5.f18127i = true;
                    } else {
                        if (rVar7 == null || !rVar7.f18127i) {
                            if (rVar6 != null) {
                                rVar6.f18127i = false;
                            }
                            rVar5.f18127i = true;
                            rVar = h(rVar, rVar5);
                            rVar3 = rVar2.f18124e;
                            rVar5 = rVar3 != null ? rVar3.g : null;
                        }
                        if (rVar5 != null) {
                            rVar5.f18127i = rVar3 == null ? false : rVar3.f18127i;
                            r rVar8 = rVar5.g;
                            if (rVar8 != null) {
                                rVar8.f18127i = false;
                            }
                        }
                        if (rVar3 != null) {
                            rVar3.f18127i = false;
                            rVar = g(rVar, rVar3);
                        }
                        rVar2 = rVar;
                    }
                }
                rVar2 = rVar3;
            } else {
                if (rVar4 != null && rVar4.f18127i) {
                    rVar4.f18127i = false;
                    rVar3.f18127i = true;
                    rVar = h(rVar, rVar3);
                    rVar3 = rVar2.f18124e;
                    rVar4 = rVar3 == null ? null : rVar3.f18125f;
                }
                if (rVar4 != null) {
                    r rVar9 = rVar4.f18125f;
                    r rVar10 = rVar4.g;
                    if ((rVar9 == null || !rVar9.f18127i) && (rVar10 == null || !rVar10.f18127i)) {
                        rVar4.f18127i = true;
                    } else {
                        if (rVar9 == null || !rVar9.f18127i) {
                            if (rVar10 != null) {
                                rVar10.f18127i = false;
                            }
                            rVar4.f18127i = true;
                            rVar = g(rVar, rVar4);
                            rVar3 = rVar2.f18124e;
                            rVar4 = rVar3 != null ? rVar3.f18125f : null;
                        }
                        if (rVar4 != null) {
                            rVar4.f18127i = rVar3 == null ? false : rVar3.f18127i;
                            r rVar11 = rVar4.f18125f;
                            if (rVar11 != null) {
                                rVar11.f18127i = false;
                            }
                        }
                        if (rVar3 != null) {
                            rVar3.f18127i = false;
                            rVar = h(rVar, rVar3);
                        }
                        rVar2 = rVar;
                    }
                }
                rVar2 = rVar3;
            }
        }
        return rVar;
    }
}
