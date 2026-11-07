package s1;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Placeholder;
import androidx.constraintlayout.widget.VirtualLayout;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f21917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21922f;
    public int g;

    public d(ConstraintLayout constraintLayout) {
        this.f21917a = constraintLayout;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0172  */
    /* JADX WARN: Code duplicated, block: B:103:0x0175 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x017b  */
    /* JADX WARN: Code duplicated, block: B:109:0x017f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0187  */
    /* JADX WARN: Code duplicated, block: B:114:0x018b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0195  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:131:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:134:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:137:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:138:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:141:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:144:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:145:0x0201  */
    /* JADX WARN: Code duplicated, block: B:148:0x0206  */
    /* JADX WARN: Code duplicated, block: B:151:0x020e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0213  */
    /* JADX WARN: Code duplicated, block: B:155:0x0218  */
    /* JADX WARN: Code duplicated, block: B:158:0x0220 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x0229 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x022b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:164:0x0235 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:165:0x0237  */
    /* JADX WARN: Code duplicated, block: B:167:0x023b  */
    /* JADX WARN: Code duplicated, block: B:169:0x0241  */
    /* JADX WARN: Code duplicated, block: B:172:0x0258  */
    /* JADX WARN: Code duplicated, block: B:173:0x025b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0261  */
    /* JADX WARN: Code duplicated, block: B:180:0x0269  */
    /* JADX WARN: Code duplicated, block: B:183:0x0271  */
    /* JADX WARN: Code duplicated, block: B:185:0x0275  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00db  */
    /* JADX WARN: Code duplicated, block: B:60:0x00df  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:69:0x010a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0112  */
    /* JADX WARN: Code duplicated, block: B:73:0x0114  */
    /* JADX WARN: Code duplicated, block: B:77:0x0122  */
    /* JADX WARN: Code duplicated, block: B:82:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x013f  */
    /* JADX WARN: Code duplicated, block: B:88:0x014d  */
    /* JADX WARN: Code duplicated, block: B:91:0x015c  */
    /* JADX WARN: Code duplicated, block: B:92:0x015e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0162  */
    /* JADX WARN: Code duplicated, block: B:95:0x0164  */
    /* JADX WARN: Code duplicated, block: B:98:0x016c A[ADDED_TO_REGION] */
    public final void a(p153p1.e eVar, p163q1.b bVar) {
        int iMakeMeasureSpec;
        boolean z10;
        int iOrdinal;
        int iMakeMeasureSpec2;
        boolean z11;
        p153p1.d dVar;
        boolean z12;
        boolean z13;
        p153p1.d dVar2;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        c cVar;
        int measuredWidth;
        int measuredHeight;
        int baseline;
        int i10;
        int measuredWidth2;
        int i11;
        int i12;
        int measuredHeight2;
        int i13;
        boolean z18;
        boolean z19;
        boolean z20;
        int i14;
        if (eVar == null) {
            return;
        }
        p153p1.c cVar2 = eVar.f20851A;
        p153p1.c cVar3 = eVar.f20900y;
        int[] iArr = eVar.g;
        if (eVar.f20869X == 8 && !eVar.f20899x) {
            bVar.f21242e = 0;
            bVar.f21243f = 0;
            bVar.g = 0;
            return;
        }
        p153p1.d dVar3 = bVar.f21238a;
        p153p1.d dVar4 = bVar.f21239b;
        int i15 = bVar.f21240c;
        int i16 = bVar.f21241d;
        int i17 = this.f21918b + this.f21919c;
        int i18 = this.f21920d;
        View view = eVar.f20868W;
        int iOrdinal2 = dVar3.ordinal();
        int i19 = 2;
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                i19 = 2;
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f21922f, i18, -2);
                iArr[2] = -2;
            } else {
                if (iOrdinal2 != 2) {
                    if (iOrdinal2 != 3) {
                        i19 = 2;
                        iMakeMeasureSpec = 0;
                        z10 = false;
                    } else {
                        int i20 = this.f21922f;
                        int i21 = cVar3 != null ? cVar3.f20844e : 0;
                        if (cVar2 != null) {
                            i21 += cVar2.f20844e;
                        }
                        iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i20, i18 + i21, -1);
                        iArr[i19] = -1;
                    }
                    iOrdinal = dVar4.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i17, -2);
                            iArr[3] = -2;
                        } else {
                            if (iOrdinal != i19) {
                                if (iOrdinal != 3) {
                                    iMakeMeasureSpec2 = 0;
                                    z11 = false;
                                } else {
                                    int i22 = this.g;
                                    if (cVar3 != null) {
                                        i14 = eVar.f20901z.f20844e;
                                    } else {
                                        i14 = 0;
                                    }
                                    if (cVar2 != null) {
                                        i14 += eVar.f20852B.f20844e;
                                    }
                                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i22, i17 + i14, -1);
                                    iArr[3] = -1;
                                }
                                dVar = p153p1.d.f20848t;
                                if (dVar3 == dVar) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (dVar4 == dVar) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                p153p1.d dVar5 = p153p1.d.f20846r;
                                dVar2 = p153p1.d.f20849u;
                                if (dVar4 != dVar2 || dVar4 == dVar5) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (dVar3 != dVar2 || dVar3 == dVar5) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z12 || eVar.f20864N <= 0.0f) {
                                    z16 = false;
                                } else {
                                    z16 = true;
                                }
                                if (z13 || eVar.f20864N <= 0.0f) {
                                    z17 = false;
                                } else {
                                    z17 = true;
                                }
                                cVar = (c) view.getLayoutParams();
                                if (bVar.j && z12 && eVar.j == 0 && z13 && eVar.f20886k == 0) {
                                    measuredWidth2 = 0;
                                    measuredHeight2 = 0;
                                    baseline = 0;
                                } else {
                                    if ((view instanceof VirtualLayout) || !(eVar instanceof p153p1.h)) {
                                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    } else {
                                        ((VirtualLayout) view).m((p153p1.h) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                                    }
                                    measuredWidth = view.getMeasuredWidth();
                                    measuredHeight = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                    if (z10) {
                                        iArr[0] = measuredWidth;
                                        iArr[2] = measuredHeight;
                                    } else {
                                        iArr[0] = 0;
                                        iArr[2] = 0;
                                    }
                                    if (z11) {
                                        iArr[1] = measuredHeight;
                                        iArr[3] = measuredWidth;
                                    } else {
                                        iArr[1] = 0;
                                        iArr[3] = 0;
                                    }
                                    i10 = eVar.f20888m;
                                    if (i10 > 0) {
                                        measuredWidth2 = Math.max(i10, measuredWidth);
                                    } else {
                                        measuredWidth2 = measuredWidth;
                                    }
                                    i11 = eVar.f20889n;
                                    if (i11 > 0) {
                                        measuredWidth2 = Math.min(i11, measuredWidth2);
                                    }
                                    i12 = eVar.f20891p;
                                    if (i12 > 0) {
                                        measuredHeight2 = Math.max(i12, measuredHeight);
                                    } else {
                                        measuredHeight2 = measuredHeight;
                                    }
                                    i13 = eVar.f20892q;
                                    if (i13 > 0) {
                                        measuredHeight2 = Math.min(i13, measuredHeight2);
                                    }
                                    if (!z16 && z14) {
                                        measuredWidth2 = (int) ((measuredHeight2 * eVar.f20864N) + 0.5f);
                                    } else if (z17 && z15) {
                                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                                    }
                                    if (measuredWidth == measuredWidth2 || measuredHeight != measuredHeight2) {
                                        if (measuredWidth != measuredWidth2) {
                                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                        }
                                        if (measuredHeight != measuredHeight2) {
                                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                        }
                                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                        measuredWidth2 = view.getMeasuredWidth();
                                        measuredHeight2 = view.getMeasuredHeight();
                                        baseline = view.getBaseline();
                                    }
                                }
                                if (baseline != -1) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                if (measuredWidth2 == bVar.f21240c || measuredHeight2 != bVar.f21241d) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                bVar.f21245i = z19;
                                if (cVar.f21878X) {
                                    z18 = true;
                                }
                                if (z18 && baseline != -1 && eVar.R != baseline) {
                                    bVar.f21245i = true;
                                }
                                bVar.f21242e = measuredWidth2;
                                bVar.f21243f = measuredHeight2;
                                bVar.f21244h = z18;
                                bVar.g = baseline;
                            }
                            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i17, -2);
                            if (eVar.f20886k == 1) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            iArr[3] = 0;
                            if (bVar.j) {
                                boolean z21 = !(z20 || iArr[2] == 0 || iArr[1] == eVar.j()) || (view instanceof Placeholder);
                                if (z20 || z21) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.j(), 1073741824);
                                }
                            }
                        }
                        z11 = true;
                        dVar = p153p1.d.f20848t;
                        if (dVar3 == dVar) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (dVar4 == dVar) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        p153p1.d dVar6 = p153p1.d.f20846r;
                        dVar2 = p153p1.d.f20849u;
                        if (dVar4 != dVar2) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        if (dVar3 != dVar2) {
                            z15 = true;
                        } else {
                            z15 = true;
                        }
                        if (z12) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        if (z13) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        cVar = (c) view.getLayoutParams();
                        if (bVar.j) {
                            if (view instanceof VirtualLayout) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            if (z10) {
                                iArr[0] = measuredWidth;
                                iArr[2] = measuredHeight;
                            } else {
                                iArr[0] = 0;
                                iArr[2] = 0;
                            }
                            if (z11) {
                                iArr[1] = measuredHeight;
                                iArr[3] = measuredWidth;
                            } else {
                                iArr[1] = 0;
                                iArr[3] = 0;
                            }
                            i10 = eVar.f20888m;
                            if (i10 > 0) {
                                measuredWidth2 = Math.max(i10, measuredWidth);
                            } else {
                                measuredWidth2 = measuredWidth;
                            }
                            i11 = eVar.f20889n;
                            if (i11 > 0) {
                                measuredWidth2 = Math.min(i11, measuredWidth2);
                            }
                            i12 = eVar.f20891p;
                            if (i12 > 0) {
                                measuredHeight2 = Math.max(i12, measuredHeight);
                            } else {
                                measuredHeight2 = measuredHeight;
                            }
                            i13 = eVar.f20892q;
                            if (i13 > 0) {
                                measuredHeight2 = Math.min(i13, measuredHeight2);
                            }
                            if (!z16) {
                                if (z17) {
                                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                                }
                            } else if (z17) {
                                measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                            }
                            if (measuredWidth == measuredWidth2) {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                        } else {
                            if (view instanceof VirtualLayout) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            if (z10) {
                                iArr[0] = measuredWidth;
                                iArr[2] = measuredHeight;
                            } else {
                                iArr[0] = 0;
                                iArr[2] = 0;
                            }
                            if (z11) {
                                iArr[1] = measuredHeight;
                                iArr[3] = measuredWidth;
                            } else {
                                iArr[1] = 0;
                                iArr[3] = 0;
                            }
                            i10 = eVar.f20888m;
                            if (i10 > 0) {
                                measuredWidth2 = Math.max(i10, measuredWidth);
                            } else {
                                measuredWidth2 = measuredWidth;
                            }
                            i11 = eVar.f20889n;
                            if (i11 > 0) {
                                measuredWidth2 = Math.min(i11, measuredWidth2);
                            }
                            i12 = eVar.f20891p;
                            if (i12 > 0) {
                                measuredHeight2 = Math.max(i12, measuredHeight);
                            } else {
                                measuredHeight2 = measuredHeight;
                            }
                            i13 = eVar.f20892q;
                            if (i13 > 0) {
                                measuredHeight2 = Math.min(i13, measuredHeight2);
                            }
                            if (!z16) {
                                if (z17) {
                                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                                }
                            } else if (z17) {
                                measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                            }
                            if (measuredWidth == measuredWidth2) {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                        }
                        if (baseline != -1) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (measuredWidth2 == bVar.f21240c) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        bVar.f21245i = z19;
                        if (cVar.f21878X) {
                            z18 = true;
                        }
                        if (z18) {
                            bVar.f21245i = true;
                        }
                        bVar.f21242e = measuredWidth2;
                        bVar.f21243f = measuredHeight2;
                        bVar.f21244h = z18;
                        bVar.g = baseline;
                    }
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                    iArr[3] = i16;
                    z11 = false;
                    dVar = p153p1.d.f20848t;
                    if (dVar3 == dVar) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (dVar4 == dVar) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    p153p1.d dVar7 = p153p1.d.f20846r;
                    dVar2 = p153p1.d.f20849u;
                    if (dVar4 != dVar2) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (dVar3 != dVar2) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (z12) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (z13) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    cVar = (c) view.getLayoutParams();
                    if (bVar.j) {
                        if (view instanceof VirtualLayout) {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        } else {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        }
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        if (z10) {
                            iArr[0] = measuredWidth;
                            iArr[2] = measuredHeight;
                        } else {
                            iArr[0] = 0;
                            iArr[2] = 0;
                        }
                        if (z11) {
                            iArr[1] = measuredHeight;
                            iArr[3] = measuredWidth;
                        } else {
                            iArr[1] = 0;
                            iArr[3] = 0;
                        }
                        i10 = eVar.f20888m;
                        if (i10 > 0) {
                            measuredWidth2 = Math.max(i10, measuredWidth);
                        } else {
                            measuredWidth2 = measuredWidth;
                        }
                        i11 = eVar.f20889n;
                        if (i11 > 0) {
                            measuredWidth2 = Math.min(i11, measuredWidth2);
                        }
                        i12 = eVar.f20891p;
                        if (i12 > 0) {
                            measuredHeight2 = Math.max(i12, measuredHeight);
                        } else {
                            measuredHeight2 = measuredHeight;
                        }
                        i13 = eVar.f20892q;
                        if (i13 > 0) {
                            measuredHeight2 = Math.min(i13, measuredHeight2);
                        }
                        if (!z16) {
                            if (z17) {
                                measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                            }
                        } else if (z17) {
                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                        }
                        if (measuredWidth == measuredWidth2) {
                            if (measuredWidth != measuredWidth2) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        } else {
                            if (measuredWidth != measuredWidth2) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        }
                    } else {
                        if (view instanceof VirtualLayout) {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        } else {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        }
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        if (z10) {
                            iArr[0] = measuredWidth;
                            iArr[2] = measuredHeight;
                        } else {
                            iArr[0] = 0;
                            iArr[2] = 0;
                        }
                        if (z11) {
                            iArr[1] = measuredHeight;
                            iArr[3] = measuredWidth;
                        } else {
                            iArr[1] = 0;
                            iArr[3] = 0;
                        }
                        i10 = eVar.f20888m;
                        if (i10 > 0) {
                            measuredWidth2 = Math.max(i10, measuredWidth);
                        } else {
                            measuredWidth2 = measuredWidth;
                        }
                        i11 = eVar.f20889n;
                        if (i11 > 0) {
                            measuredWidth2 = Math.min(i11, measuredWidth2);
                        }
                        i12 = eVar.f20891p;
                        if (i12 > 0) {
                            measuredHeight2 = Math.max(i12, measuredHeight);
                        } else {
                            measuredHeight2 = measuredHeight;
                        }
                        i13 = eVar.f20892q;
                        if (i13 > 0) {
                            measuredHeight2 = Math.min(i13, measuredHeight2);
                        }
                        if (!z16) {
                            if (z17) {
                                measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                            }
                        } else if (z17) {
                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                        }
                        if (measuredWidth == measuredWidth2) {
                            if (measuredWidth != measuredWidth2) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        } else {
                            if (measuredWidth != measuredWidth2) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        }
                    }
                    if (baseline != -1) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (measuredWidth2 == bVar.f21240c) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    bVar.f21245i = z19;
                    if (cVar.f21878X) {
                        z18 = true;
                    }
                    if (z18) {
                        bVar.f21245i = true;
                    }
                    bVar.f21242e = measuredWidth2;
                    bVar.f21243f = measuredHeight2;
                    bVar.f21244h = z18;
                    bVar.g = baseline;
                }
                i19 = 2;
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f21922f, i18, -2);
                boolean z22 = eVar.j == 1;
                iArr[2] = 0;
                if (bVar.j) {
                    boolean z23 = !(!z22 || iArr[3] == 0 || iArr[0] == eVar.m()) || (view instanceof Placeholder);
                    if (!z22 || z23) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.m(), 1073741824);
                    }
                }
            }
            z10 = true;
            iOrdinal = dVar4.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i17, -2);
                    iArr[3] = -2;
                } else {
                    if (iOrdinal != i19) {
                        if (iOrdinal != 3) {
                            iMakeMeasureSpec2 = 0;
                            z11 = false;
                        } else {
                            int i23 = this.g;
                            if (cVar3 != null) {
                                i14 = eVar.f20901z.f20844e;
                            } else {
                                i14 = 0;
                            }
                            if (cVar2 != null) {
                                i14 += eVar.f20852B.f20844e;
                            }
                            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i23, i17 + i14, -1);
                            iArr[3] = -1;
                        }
                        dVar = p153p1.d.f20848t;
                        if (dVar3 == dVar) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (dVar4 == dVar) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        p153p1.d dVar8 = p153p1.d.f20846r;
                        dVar2 = p153p1.d.f20849u;
                        if (dVar4 != dVar2) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        if (dVar3 != dVar2) {
                            z15 = true;
                        } else {
                            z15 = true;
                        }
                        if (z12) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        if (z13) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        cVar = (c) view.getLayoutParams();
                        if (bVar.j) {
                            if (view instanceof VirtualLayout) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            if (z10) {
                                iArr[0] = measuredWidth;
                                iArr[2] = measuredHeight;
                            } else {
                                iArr[0] = 0;
                                iArr[2] = 0;
                            }
                            if (z11) {
                                iArr[1] = measuredHeight;
                                iArr[3] = measuredWidth;
                            } else {
                                iArr[1] = 0;
                                iArr[3] = 0;
                            }
                            i10 = eVar.f20888m;
                            if (i10 > 0) {
                                measuredWidth2 = Math.max(i10, measuredWidth);
                            } else {
                                measuredWidth2 = measuredWidth;
                            }
                            i11 = eVar.f20889n;
                            if (i11 > 0) {
                                measuredWidth2 = Math.min(i11, measuredWidth2);
                            }
                            i12 = eVar.f20891p;
                            if (i12 > 0) {
                                measuredHeight2 = Math.max(i12, measuredHeight);
                            } else {
                                measuredHeight2 = measuredHeight;
                            }
                            i13 = eVar.f20892q;
                            if (i13 > 0) {
                                measuredHeight2 = Math.min(i13, measuredHeight2);
                            }
                            if (!z16) {
                                if (z17) {
                                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                                }
                            } else if (z17) {
                                measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                            }
                            if (measuredWidth == measuredWidth2) {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                        } else {
                            if (view instanceof VirtualLayout) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            if (z10) {
                                iArr[0] = measuredWidth;
                                iArr[2] = measuredHeight;
                            } else {
                                iArr[0] = 0;
                                iArr[2] = 0;
                            }
                            if (z11) {
                                iArr[1] = measuredHeight;
                                iArr[3] = measuredWidth;
                            } else {
                                iArr[1] = 0;
                                iArr[3] = 0;
                            }
                            i10 = eVar.f20888m;
                            if (i10 > 0) {
                                measuredWidth2 = Math.max(i10, measuredWidth);
                            } else {
                                measuredWidth2 = measuredWidth;
                            }
                            i11 = eVar.f20889n;
                            if (i11 > 0) {
                                measuredWidth2 = Math.min(i11, measuredWidth2);
                            }
                            i12 = eVar.f20891p;
                            if (i12 > 0) {
                                measuredHeight2 = Math.max(i12, measuredHeight);
                            } else {
                                measuredHeight2 = measuredHeight;
                            }
                            i13 = eVar.f20892q;
                            if (i13 > 0) {
                                measuredHeight2 = Math.min(i13, measuredHeight2);
                            }
                            if (!z16) {
                                if (z17) {
                                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                                }
                            } else if (z17) {
                                measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                            }
                            if (measuredWidth == measuredWidth2) {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                        }
                        if (baseline != -1) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (measuredWidth2 == bVar.f21240c) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        bVar.f21245i = z19;
                        if (cVar.f21878X) {
                            z18 = true;
                        }
                        if (z18) {
                            bVar.f21245i = true;
                        }
                        bVar.f21242e = measuredWidth2;
                        bVar.f21243f = measuredHeight2;
                        bVar.f21244h = z18;
                        bVar.g = baseline;
                    }
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i17, -2);
                    if (eVar.f20886k == 1) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    iArr[3] = 0;
                    if (bVar.j) {
                        if (z20) {
                        }
                        if (z20) {
                        }
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.j(), 1073741824);
                    }
                }
                z11 = true;
                dVar = p153p1.d.f20848t;
                if (dVar3 == dVar) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (dVar4 == dVar) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                p153p1.d dVar9 = p153p1.d.f20846r;
                dVar2 = p153p1.d.f20849u;
                if (dVar4 != dVar2) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (dVar3 != dVar2) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (z12) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                if (z13) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                cVar = (c) view.getLayoutParams();
                if (bVar.j) {
                    if (view instanceof VirtualLayout) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    if (z10) {
                        iArr[0] = measuredWidth;
                        iArr[2] = measuredHeight;
                    } else {
                        iArr[0] = 0;
                        iArr[2] = 0;
                    }
                    if (z11) {
                        iArr[1] = measuredHeight;
                        iArr[3] = measuredWidth;
                    } else {
                        iArr[1] = 0;
                        iArr[3] = 0;
                    }
                    i10 = eVar.f20888m;
                    if (i10 > 0) {
                        measuredWidth2 = Math.max(i10, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    i11 = eVar.f20889n;
                    if (i11 > 0) {
                        measuredWidth2 = Math.min(i11, measuredWidth2);
                    }
                    i12 = eVar.f20891p;
                    if (i12 > 0) {
                        measuredHeight2 = Math.max(i12, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    i13 = eVar.f20892q;
                    if (i13 > 0) {
                        measuredHeight2 = Math.min(i13, measuredHeight2);
                    }
                    if (!z16) {
                        if (z17) {
                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                        }
                    } else if (z17) {
                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                    }
                    if (measuredWidth == measuredWidth2) {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                } else {
                    if (view instanceof VirtualLayout) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    if (z10) {
                        iArr[0] = measuredWidth;
                        iArr[2] = measuredHeight;
                    } else {
                        iArr[0] = 0;
                        iArr[2] = 0;
                    }
                    if (z11) {
                        iArr[1] = measuredHeight;
                        iArr[3] = measuredWidth;
                    } else {
                        iArr[1] = 0;
                        iArr[3] = 0;
                    }
                    i10 = eVar.f20888m;
                    if (i10 > 0) {
                        measuredWidth2 = Math.max(i10, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    i11 = eVar.f20889n;
                    if (i11 > 0) {
                        measuredWidth2 = Math.min(i11, measuredWidth2);
                    }
                    i12 = eVar.f20891p;
                    if (i12 > 0) {
                        measuredHeight2 = Math.max(i12, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    i13 = eVar.f20892q;
                    if (i13 > 0) {
                        measuredHeight2 = Math.min(i13, measuredHeight2);
                    }
                    if (!z16) {
                        if (z17) {
                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                        }
                    } else if (z17) {
                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                    }
                    if (measuredWidth == measuredWidth2) {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                }
                if (baseline != -1) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (measuredWidth2 == bVar.f21240c) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                bVar.f21245i = z19;
                if (cVar.f21878X) {
                    z18 = true;
                }
                if (z18) {
                    bVar.f21245i = true;
                }
                bVar.f21242e = measuredWidth2;
                bVar.f21243f = measuredHeight2;
                bVar.f21244h = z18;
                bVar.g = baseline;
            }
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
            iArr[3] = i16;
            z11 = false;
            dVar = p153p1.d.f20848t;
            if (dVar3 == dVar) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (dVar4 == dVar) {
                z13 = true;
            } else {
                z13 = false;
            }
            p153p1.d dVar10 = p153p1.d.f20846r;
            dVar2 = p153p1.d.f20849u;
            if (dVar4 != dVar2) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (dVar3 != dVar2) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (z12) {
                z16 = false;
            } else {
                z16 = false;
            }
            if (z13) {
                z17 = false;
            } else {
                z17 = false;
            }
            cVar = (c) view.getLayoutParams();
            if (bVar.j) {
                if (view instanceof VirtualLayout) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                if (z10) {
                    iArr[0] = measuredWidth;
                    iArr[2] = measuredHeight;
                } else {
                    iArr[0] = 0;
                    iArr[2] = 0;
                }
                if (z11) {
                    iArr[1] = measuredHeight;
                    iArr[3] = measuredWidth;
                } else {
                    iArr[1] = 0;
                    iArr[3] = 0;
                }
                i10 = eVar.f20888m;
                if (i10 > 0) {
                    measuredWidth2 = Math.max(i10, measuredWidth);
                } else {
                    measuredWidth2 = measuredWidth;
                }
                i11 = eVar.f20889n;
                if (i11 > 0) {
                    measuredWidth2 = Math.min(i11, measuredWidth2);
                }
                i12 = eVar.f20891p;
                if (i12 > 0) {
                    measuredHeight2 = Math.max(i12, measuredHeight);
                } else {
                    measuredHeight2 = measuredHeight;
                }
                i13 = eVar.f20892q;
                if (i13 > 0) {
                    measuredHeight2 = Math.min(i13, measuredHeight2);
                }
                if (!z16) {
                    if (z17) {
                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                    }
                } else if (z17) {
                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                }
                if (measuredWidth == measuredWidth2) {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
            } else {
                if (view instanceof VirtualLayout) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                if (z10) {
                    iArr[0] = measuredWidth;
                    iArr[2] = measuredHeight;
                } else {
                    iArr[0] = 0;
                    iArr[2] = 0;
                }
                if (z11) {
                    iArr[1] = measuredHeight;
                    iArr[3] = measuredWidth;
                } else {
                    iArr[1] = 0;
                    iArr[3] = 0;
                }
                i10 = eVar.f20888m;
                if (i10 > 0) {
                    measuredWidth2 = Math.max(i10, measuredWidth);
                } else {
                    measuredWidth2 = measuredWidth;
                }
                i11 = eVar.f20889n;
                if (i11 > 0) {
                    measuredWidth2 = Math.min(i11, measuredWidth2);
                }
                i12 = eVar.f20891p;
                if (i12 > 0) {
                    measuredHeight2 = Math.max(i12, measuredHeight);
                } else {
                    measuredHeight2 = measuredHeight;
                }
                i13 = eVar.f20892q;
                if (i13 > 0) {
                    measuredHeight2 = Math.min(i13, measuredHeight2);
                }
                if (!z16) {
                    if (z17) {
                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                    }
                } else if (z17) {
                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                }
                if (measuredWidth == measuredWidth2) {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
            }
            if (baseline != -1) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (measuredWidth2 == bVar.f21240c) {
                z19 = true;
            } else {
                z19 = true;
            }
            bVar.f21245i = z19;
            if (cVar.f21878X) {
                z18 = true;
            }
            if (z18) {
                bVar.f21245i = true;
            }
            bVar.f21242e = measuredWidth2;
            bVar.f21243f = measuredHeight2;
            bVar.f21244h = z18;
            bVar.g = baseline;
        }
        i19 = 2;
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        iArr[2] = i15;
        iMakeMeasureSpec = iMakeMeasureSpec3;
        z10 = false;
        iOrdinal = dVar4.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i17, -2);
                iArr[3] = -2;
            } else {
                if (iOrdinal != i19) {
                    if (iOrdinal != 3) {
                        iMakeMeasureSpec2 = 0;
                        z11 = false;
                    } else {
                        int i24 = this.g;
                        if (cVar3 != null) {
                            i14 = eVar.f20901z.f20844e;
                        } else {
                            i14 = 0;
                        }
                        if (cVar2 != null) {
                            i14 += eVar.f20852B.f20844e;
                        }
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i24, i17 + i14, -1);
                        iArr[3] = -1;
                    }
                    dVar = p153p1.d.f20848t;
                    if (dVar3 == dVar) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (dVar4 == dVar) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    p153p1.d dVar11 = p153p1.d.f20846r;
                    dVar2 = p153p1.d.f20849u;
                    if (dVar4 != dVar2) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (dVar3 != dVar2) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (z12) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (z13) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    cVar = (c) view.getLayoutParams();
                    if (bVar.j) {
                        if (view instanceof VirtualLayout) {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        } else {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        }
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        if (z10) {
                            iArr[0] = measuredWidth;
                            iArr[2] = measuredHeight;
                        } else {
                            iArr[0] = 0;
                            iArr[2] = 0;
                        }
                        if (z11) {
                            iArr[1] = measuredHeight;
                            iArr[3] = measuredWidth;
                        } else {
                            iArr[1] = 0;
                            iArr[3] = 0;
                        }
                        i10 = eVar.f20888m;
                        if (i10 > 0) {
                            measuredWidth2 = Math.max(i10, measuredWidth);
                        } else {
                            measuredWidth2 = measuredWidth;
                        }
                        i11 = eVar.f20889n;
                        if (i11 > 0) {
                            measuredWidth2 = Math.min(i11, measuredWidth2);
                        }
                        i12 = eVar.f20891p;
                        if (i12 > 0) {
                            measuredHeight2 = Math.max(i12, measuredHeight);
                        } else {
                            measuredHeight2 = measuredHeight;
                        }
                        i13 = eVar.f20892q;
                        if (i13 > 0) {
                            measuredHeight2 = Math.min(i13, measuredHeight2);
                        }
                        if (!z16) {
                            if (z17) {
                                measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                            }
                        } else if (z17) {
                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                        }
                        if (measuredWidth == measuredWidth2) {
                            if (measuredWidth != measuredWidth2) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        } else {
                            if (measuredWidth != measuredWidth2) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        }
                    } else {
                        if (view instanceof VirtualLayout) {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        } else {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        }
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        if (z10) {
                            iArr[0] = measuredWidth;
                            iArr[2] = measuredHeight;
                        } else {
                            iArr[0] = 0;
                            iArr[2] = 0;
                        }
                        if (z11) {
                            iArr[1] = measuredHeight;
                            iArr[3] = measuredWidth;
                        } else {
                            iArr[1] = 0;
                            iArr[3] = 0;
                        }
                        i10 = eVar.f20888m;
                        if (i10 > 0) {
                            measuredWidth2 = Math.max(i10, measuredWidth);
                        } else {
                            measuredWidth2 = measuredWidth;
                        }
                        i11 = eVar.f20889n;
                        if (i11 > 0) {
                            measuredWidth2 = Math.min(i11, measuredWidth2);
                        }
                        i12 = eVar.f20891p;
                        if (i12 > 0) {
                            measuredHeight2 = Math.max(i12, measuredHeight);
                        } else {
                            measuredHeight2 = measuredHeight;
                        }
                        i13 = eVar.f20892q;
                        if (i13 > 0) {
                            measuredHeight2 = Math.min(i13, measuredHeight2);
                        }
                        if (!z16) {
                            if (z17) {
                                measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                            }
                        } else if (z17) {
                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                        }
                        if (measuredWidth == measuredWidth2) {
                            if (measuredWidth != measuredWidth2) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        } else {
                            if (measuredWidth != measuredWidth2) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        }
                    }
                    if (baseline != -1) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (measuredWidth2 == bVar.f21240c) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    bVar.f21245i = z19;
                    if (cVar.f21878X) {
                        z18 = true;
                    }
                    if (z18) {
                        bVar.f21245i = true;
                    }
                    bVar.f21242e = measuredWidth2;
                    bVar.f21243f = measuredHeight2;
                    bVar.f21244h = z18;
                    bVar.g = baseline;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i17, -2);
                if (eVar.f20886k == 1) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                iArr[3] = 0;
                if (bVar.j) {
                    if (z20) {
                    }
                    if (z20) {
                    }
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.j(), 1073741824);
                }
            }
            z11 = true;
            dVar = p153p1.d.f20848t;
            if (dVar3 == dVar) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (dVar4 == dVar) {
                z13 = true;
            } else {
                z13 = false;
            }
            p153p1.d dVar12 = p153p1.d.f20846r;
            dVar2 = p153p1.d.f20849u;
            if (dVar4 != dVar2) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (dVar3 != dVar2) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (z12) {
                z16 = false;
            } else {
                z16 = false;
            }
            if (z13) {
                z17 = false;
            } else {
                z17 = false;
            }
            cVar = (c) view.getLayoutParams();
            if (bVar.j) {
                if (view instanceof VirtualLayout) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                if (z10) {
                    iArr[0] = measuredWidth;
                    iArr[2] = measuredHeight;
                } else {
                    iArr[0] = 0;
                    iArr[2] = 0;
                }
                if (z11) {
                    iArr[1] = measuredHeight;
                    iArr[3] = measuredWidth;
                } else {
                    iArr[1] = 0;
                    iArr[3] = 0;
                }
                i10 = eVar.f20888m;
                if (i10 > 0) {
                    measuredWidth2 = Math.max(i10, measuredWidth);
                } else {
                    measuredWidth2 = measuredWidth;
                }
                i11 = eVar.f20889n;
                if (i11 > 0) {
                    measuredWidth2 = Math.min(i11, measuredWidth2);
                }
                i12 = eVar.f20891p;
                if (i12 > 0) {
                    measuredHeight2 = Math.max(i12, measuredHeight);
                } else {
                    measuredHeight2 = measuredHeight;
                }
                i13 = eVar.f20892q;
                if (i13 > 0) {
                    measuredHeight2 = Math.min(i13, measuredHeight2);
                }
                if (!z16) {
                    if (z17) {
                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                    }
                } else if (z17) {
                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                }
                if (measuredWidth == measuredWidth2) {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
            } else {
                if (view instanceof VirtualLayout) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                if (z10) {
                    iArr[0] = measuredWidth;
                    iArr[2] = measuredHeight;
                } else {
                    iArr[0] = 0;
                    iArr[2] = 0;
                }
                if (z11) {
                    iArr[1] = measuredHeight;
                    iArr[3] = measuredWidth;
                } else {
                    iArr[1] = 0;
                    iArr[3] = 0;
                }
                i10 = eVar.f20888m;
                if (i10 > 0) {
                    measuredWidth2 = Math.max(i10, measuredWidth);
                } else {
                    measuredWidth2 = measuredWidth;
                }
                i11 = eVar.f20889n;
                if (i11 > 0) {
                    measuredWidth2 = Math.min(i11, measuredWidth2);
                }
                i12 = eVar.f20891p;
                if (i12 > 0) {
                    measuredHeight2 = Math.max(i12, measuredHeight);
                } else {
                    measuredHeight2 = measuredHeight;
                }
                i13 = eVar.f20892q;
                if (i13 > 0) {
                    measuredHeight2 = Math.min(i13, measuredHeight2);
                }
                if (!z16) {
                    if (z17) {
                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                    }
                } else if (z17) {
                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                }
                if (measuredWidth == measuredWidth2) {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
            }
            if (baseline != -1) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (measuredWidth2 == bVar.f21240c) {
                z19 = true;
            } else {
                z19 = true;
            }
            bVar.f21245i = z19;
            if (cVar.f21878X) {
                z18 = true;
            }
            if (z18) {
                bVar.f21245i = true;
            }
            bVar.f21242e = measuredWidth2;
            bVar.f21243f = measuredHeight2;
            bVar.f21244h = z18;
            bVar.g = baseline;
        }
        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
        iArr[3] = i16;
        z11 = false;
        dVar = p153p1.d.f20848t;
        if (dVar3 == dVar) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (dVar4 == dVar) {
            z13 = true;
        } else {
            z13 = false;
        }
        p153p1.d dVar13 = p153p1.d.f20846r;
        dVar2 = p153p1.d.f20849u;
        if (dVar4 != dVar2) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (dVar3 != dVar2) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (z12) {
            z16 = false;
        } else {
            z16 = false;
        }
        if (z13) {
            z17 = false;
        } else {
            z17 = false;
        }
        cVar = (c) view.getLayoutParams();
        if (bVar.j) {
            if (view instanceof VirtualLayout) {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            baseline = view.getBaseline();
            if (z10) {
                iArr[0] = measuredWidth;
                iArr[2] = measuredHeight;
            } else {
                iArr[0] = 0;
                iArr[2] = 0;
            }
            if (z11) {
                iArr[1] = measuredHeight;
                iArr[3] = measuredWidth;
            } else {
                iArr[1] = 0;
                iArr[3] = 0;
            }
            i10 = eVar.f20888m;
            if (i10 > 0) {
                measuredWidth2 = Math.max(i10, measuredWidth);
            } else {
                measuredWidth2 = measuredWidth;
            }
            i11 = eVar.f20889n;
            if (i11 > 0) {
                measuredWidth2 = Math.min(i11, measuredWidth2);
            }
            i12 = eVar.f20891p;
            if (i12 > 0) {
                measuredHeight2 = Math.max(i12, measuredHeight);
            } else {
                measuredHeight2 = measuredHeight;
            }
            i13 = eVar.f20892q;
            if (i13 > 0) {
                measuredHeight2 = Math.min(i13, measuredHeight2);
            }
            if (!z16) {
                if (z17) {
                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                }
            } else if (z17) {
                measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
            }
            if (measuredWidth == measuredWidth2) {
                if (measuredWidth != measuredWidth2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                }
                if (measuredHeight != measuredHeight2) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                }
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                measuredWidth2 = view.getMeasuredWidth();
                measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
            } else {
                if (measuredWidth != measuredWidth2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                }
                if (measuredHeight != measuredHeight2) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                }
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                measuredWidth2 = view.getMeasuredWidth();
                measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
            }
        } else {
            if (view instanceof VirtualLayout) {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            baseline = view.getBaseline();
            if (z10) {
                iArr[0] = measuredWidth;
                iArr[2] = measuredHeight;
            } else {
                iArr[0] = 0;
                iArr[2] = 0;
            }
            if (z11) {
                iArr[1] = measuredHeight;
                iArr[3] = measuredWidth;
            } else {
                iArr[1] = 0;
                iArr[3] = 0;
            }
            i10 = eVar.f20888m;
            if (i10 > 0) {
                measuredWidth2 = Math.max(i10, measuredWidth);
            } else {
                measuredWidth2 = measuredWidth;
            }
            i11 = eVar.f20889n;
            if (i11 > 0) {
                measuredWidth2 = Math.min(i11, measuredWidth2);
            }
            i12 = eVar.f20891p;
            if (i12 > 0) {
                measuredHeight2 = Math.max(i12, measuredHeight);
            } else {
                measuredHeight2 = measuredHeight;
            }
            i13 = eVar.f20892q;
            if (i13 > 0) {
                measuredHeight2 = Math.min(i13, measuredHeight2);
            }
            if (!z16) {
                if (z17) {
                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
                }
            } else if (z17) {
                measuredHeight2 = (int) ((measuredWidth2 / eVar.f20864N) + 0.5f);
            }
            if (measuredWidth == measuredWidth2) {
                if (measuredWidth != measuredWidth2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                }
                if (measuredHeight != measuredHeight2) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                }
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                measuredWidth2 = view.getMeasuredWidth();
                measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
            } else {
                if (measuredWidth != measuredWidth2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                }
                if (measuredHeight != measuredHeight2) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                }
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                measuredWidth2 = view.getMeasuredWidth();
                measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
            }
        }
        if (baseline != -1) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (measuredWidth2 == bVar.f21240c) {
            z19 = true;
        } else {
            z19 = true;
        }
        bVar.f21245i = z19;
        if (cVar.f21878X) {
            z18 = true;
        }
        if (z18) {
            bVar.f21245i = true;
        }
        bVar.f21242e = measuredWidth2;
        bVar.f21243f = measuredHeight2;
        bVar.f21244h = z18;
        bVar.g = baseline;
    }
}
