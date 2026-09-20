package com.example.data.sample

import com.example.data.model.AiReviewSummary
import com.example.data.model.Product
import com.example.data.model.ProductCategory
import com.example.data.model.Review
import com.example.data.model.SpecTag
import com.example.data.model.StoreOffer

object ProductCatalog {
    val products: List<Product> = listOf(
        // 1. Samsung Galaxy S24 Ultra
        Product(
            id = "s24-ultra",
            name = "Samsung Galaxy S24 Ultra",
            brand = "Samsung",
            category = ProductCategory.PHONES,
            imageUrl = "https://images.unsplash.com/photo-1610945265064-0e34e5519bbf?w=500&q=80",
            specTags = listOf(SpecTag.CAMERA, SpecTag.PERFORMANCE, SpecTag.OLED, SpecTag.BATTERY, SpecTag.STORAGE),
            specsAr = mapOf(
                "الشاشة" to "6.8 بوصة Dynamic AMOLED 2X 120Hz مسطحة بالكامل",
                "المعالج" to "Snapdragon 8 Gen 3 for Galaxy (4nm)",
                "الكاميرا" to "200 ميجابكسل رئيسية + 50MP زووم 5x + 10MP زووم 3x",
                "البطارية والشحن" to "5000 مللي أمبير، شحن سريع 45 واط",
                "الذاكرة والتخزين" to "12 جيجابايت RAM + 256 جيجابايت UFS 4.0",
                "الميزات الإضافية" to "قلم S-Pen مدمج، حماية تيتانيوم، ذكاء Galaxy AI"
            ),
            specsEn = mapOf(
                "Display" to "6.8-inch Dynamic AMOLED 2X 120Hz Flat Screen",
                "Processor" to "Snapdragon 8 Gen 3 for Galaxy (4nm)",
                "Camera" to "200MP Main + 50MP 5x Periscope + 10MP 3x Telephoto",
                "Battery & Charging" to "5000 mAh, 45W Fast Charging",
                "Memory & Storage" to "12GB RAM + 256GB UFS 4.0 Storage",
                "Key Features" to "Built-in S-Pen, Titanium Frame, Galaxy AI suite"
            ),
            specsFr = mapOf(
                "Écran" to "6,8\" Dynamic AMOLED 2X 120Hz écran plat antireflet",
                "Processeur" to "Snapdragon 8 Gen 3 for Galaxy (4nm)",
                "Appareil photo" to "200 Mpx Principal + 50 Mpx Zoom 5x périscopique",
                "Batterie" to "5000 mAh, charge rapide 45W",
                "Mémoire" to "12 Go RAM + 256 Go stockage UFS 4.0",
                "Fonctions clés" to "Stylet S-Pen intégré, cadre titane, Galaxy AI"
            ),
            descriptionAr = "أفضل هاتف رائد متكامل بنظام أندرويد مع كاميرا احترافية وشاشة فائقة السطوع ودعم التحديثات لـ 7 سنوات.",
            descriptionEn = "The ultimate Android flagship with industry-leading zoom cameras, anti-reflective display, and 7 years of OS updates.",
            descriptionFr = "Le smartphone Android par excellence, avec zoom périscopique remarquable et 7 ans de mises à jour.",
            offers = listOf(
                StoreOffer("Amazon", "Global Verified", 1049.0, 1299.0, true, "In Stock", 4.9f, true, true, "https://amazon.com"),
                StoreOffer("Ouedkniss (Store Tech DZ)", "Algeria Local Store", 1080.0, 1320.0, true, "متوفر تسليم فوري بالجزائر", 4.8f, true, false, "https://ouedkniss.com"),
                StoreOffer("Fnac", "Official Retailer", 1149.0, 1299.0, true, "En stock magasin", 4.7f, true, false, "https://fnac.com"),
                StoreOffer("Jumia DZ", "Algeria Online", 1110.0, 1300.0, true, "توصيل لـ 58 ولاية", 4.6f, false, false, "https://jumia.dz"),
                StoreOffer("Best Buy", "US Retailer", 1099.0, 1299.0, true, "Ships in 24h", 4.8f, true, false, "https://bestbuy.com")
            ),
            reviews = listOf(
                Review(
                    id = "rev-1",
                    userName = "Karim B. (الجزائر العاصمة)",
                    rating = 5.0f,
                    date = "2026-02-15",
                    isVerifiedBuyer = true,
                    usagePeriod = "4 months",
                    commentAr = "اشتريته بعد مقارنة طويلة في واد كنيس وأمازون. الشاشة المسطحة المضادة للانعكاس مذهلة تحت شمس الصيف والبطارية تكفيني يومين كاملين بسهولة!",
                    commentEn = "Bought after thorough comparison. The anti-reflective flat screen is unbelievable in bright sunlight and the battery easily lasts two days!",
                    commentFr = "Acheté après longue comparaison. L'écran plat antireflet est bluffant en plein soleil et l'autonomie atteint deux jours réels !"
                ),
                Review(
                    id = "rev-2",
                    userName = "Sophie M.",
                    rating = 4.5f,
                    date = "2026-01-20",
                    isVerifiedBuyer = true,
                    usagePeriod = "6 months",
                    commentAr = "جودة صور التقريب والزووم خرافية. الهاتف ثقيل قليلاً في الجيب لكنه صلب وفخم جداً.",
                    commentEn = "Telephoto photo quality is remarkable. A bit heavy in the pocket, but very solid and premium build.",
                    commentFr = "La qualité du zoom est exceptionnelle. Un peu lourd en poche, mais finitions très haut de gamme."
                )
            ),
            aiSummary = AiReviewSummary(
                sentimentScore = 95,
                totalReviewsAnalyzed = 1420,
                summaryAr = "أجمع أكثر من 95% من المشترين على تفوق شاشة الهاتف المقاومة للانعكاسات وعمر البطارية الطويل ودقة كاميرا الزوم 5x، مع تنبيه بسيط لوزنه الثقيل نسبياً.",
                summaryEn = "Over 95% of verified buyers praise the groundbreaking anti-reflective flat screen, 2-day battery endurance, and 5x optical telephoto clarity. Minor caveat is its heavier hand weight.",
                summaryFr = "Plus de 95% des avis vérifiés soulignent l'excellence de l'écran antireflet, l'autonomie de deux jours et le zoom 5x. Seul point d'attention : le poids en main.",
                prosAr = listOf("شاشة مسطحة مذهلة خالية من الانعكاسات", "بطارية تصمد ليومين من الاستخدام المتوسط", "أفضل كاميرا زووم وتصوير ليلي", "دعم تحديثات نظام مضمون لمدة 7 سنوات"),
                prosEn = listOf("Groundbreaking anti-reflective Gorilla Armor glass", "Superb 2-day battery life", "Industry best zoom & low-light photography", "7 years of guaranteed Android updates"),
                prosFr = listOf("Verre antireflet Gorilla Armor spectaculaire", "Excellente autonomie de 2 jours", "Zoom optique ultra net et précis", "7 ans de support et mises à jour logicielles"),
                consAr = listOf("وزن الجهاز ثقيل نسبياً (232 غرام)", "سرعة الشحن 45W متوسطة مقارنة بالمنافسين الصينيين"),
                consEn = listOf("Heavy device weight (232g)", "45W charging speed is slower than Chinese rivals"),
                consFr = listOf("Appareil lourd en main (232 g)", "Charge 45W moins rapide que certains concurrents"),
                verdictAr = "شراء موصى به بقوة للمحترفين وعشاق التصوير والإنتاجية لمن يبحث عن هاتف يدوم 5+ سنوات.",
                verdictEn = "Strongly Recommended for productivity power-users and mobile photographers seeking a future-proof 5+ year daily driver.",
                verdictFr = "Achat chaudement recommandé pour les utilisateurs exigeants cherchant un smartphone durable sur 5 ans et plus."
            ),
            rating = 4.8f,
            reviewsCount = 1420,
            isRealDiscount = true,
            dealTag = "خصم 200$ حقيقي"
        ),

        // 2. Xiaomi Redmi Note 13 Pro+ 5G (Best Value Budget Phone)
        Product(
            id = "redmi-note-13-pro-plus",
            name = "Xiaomi Redmi Note 13 Pro+ 5G",
            brand = "Xiaomi",
            category = ProductCategory.PHONES,
            imageUrl = "https://images.unsplash.com/photo-1598327105666-5b89351aff97?w=500&q=80",
            specTags = listOf(SpecTag.VALUE, SpecTag.CAMERA, SpecTag.OLED, SpecTag.STORAGE),
            specsAr = mapOf(
                "الشاشة" to "6.67 بوصة AMOLED منحنية 1.5K 120Hz بسطوع 1800 nits",
                "المعالج" to "MediaTek Dimensity 7200-Ultra (4nm)",
                "الكاميرا" to "200 ميجابكسل رئيسية بمستشعر Samsung HP3 ومثبت OIS",
                "البطارية والشحن" to "5000 mAh مع شاحن صاروخي 120 واط (100% في 19 دقيقة)",
                "الذاكرة والتخزين" to "12 جيجابايت RAM + 512 جيجابايت تخزين ضخم",
                "مقاومة الماء" to "معيار رسمي IP68 لمقاومة الماء والغبار لأول مرة"
            ),
            specsEn = mapOf(
                "Display" to "6.67-inch Curved AMOLED 1.5K 120Hz, 1800 nits peak",
                "Processor" to "MediaTek Dimensity 7200-Ultra (4nm)",
                "Camera" to "200MP Main OIS Sensor (Samsung HP3)",
                "Battery & Charging" to "5000 mAh with blazing 120W HyperCharge (0-100% in 19 mins)",
                "Memory & Storage" to "12GB RAM + 512GB Storage",
                "Water Resistance" to "Official IP68 water and dust resistance"
            ),
            specsFr = mapOf(
                "Écran" to "6,67\" AMOLED incurvé 1,5K 120Hz, 1800 nits",
                "Processeur" to "MediaTek Dimensity 7200-Ultra (4nm)",
                "Appareil photo" to "200 Mpx avec stabilisateur optique OIS",
                "Batterie" to "5000 mAh avec charge ultra rapide 120W (100% en 19 min)",
                "Mémoire" to "12 Go RAM + 512 Go de stockage",
                "Étanchéité" to "Certification étanche officielle IP68"
            ),
            descriptionAr = "البطل بلا منازع في الفئة المتوسطة: شحن 120 واط فائق السرعة، كاميرا 200 ميجابكسل، ومقاومة ماء IP68 بسعر اقتصادي.",
            descriptionEn = "The undisputed mid-range king: 120W hyper-charging, 200MP camera, and true IP68 water resistance at an unbeatable price.",
            descriptionFr = "Le champion incontestable du milieu de gamme : recharge 120W, capteur 200 Mpx et étanchéité IP68.",
            offers = listOf(
                StoreOffer("Ouedkniss (Belfort Store)", "Algeria Local Store", 340.0, 420.0, true, "متوفر متجر بلفور - الجزائر", 4.9f, true, true, "https://ouedkniss.com"),
                StoreOffer("Jumia DZ", "Algeria Online", 355.0, 410.0, true, "توصيل خلال 48 ساعة", 4.7f, true, false, "https://jumia.dz"),
                StoreOffer("Amazon", "Global Retailer", 369.0, 430.0, true, "In Stock Global", 4.8f, false, false, "https://amazon.com"),
                StoreOffer("Fnac", "Official Retailer", 389.0, 449.0, true, "Garantie 2 ans", 4.6f, true, false, "https://fnac.com")
            ),
            reviews = listOf(
                Review(
                    id = "rev-3",
                    userName = "Amine T. (وهران)",
                    rating = 5.0f,
                    date = "2026-02-01",
                    isVerifiedBuyer = true,
                    usagePeriod = "5 months",
                    commentAr = "أفضل هاتف اشتريته في حياتي مقارنة بسعره في الجزائر. الشحن في 19 دقيقة نعمة حقيقية والكاميرا ممتازة بالنهار ومقاومة الماء IP68 ممتازة.",
                    commentEn = "Best phone value in Algeria. 19-minute full charging is life-changing, daylight camera is crisp, and IP68 gives huge peace of mind.",
                    commentFr = "Meilleur rapport qualité/prix. La recharge en 19 minutes change la vie et l'étanchéité IP68 est très rassurante."
                ),
                Review(
                    id = "rev-4",
                    userName = "Yacine G.",
                    rating = 4.0f,
                    date = "2026-01-14",
                    isVerifiedBuyer = true,
                    usagePeriod = "2 months",
                    commentAr = "الجهاز رائع جداً، العيب الوحيد وجود بعض التطبيقات المثبتة مسبقاً في نظام شاومي ولكن يمكن حذفها بسهولة.",
                    commentEn = "Fantastic phone, only slight downside is pre-installed bloatware which you can easily uninstall.",
                    commentFr = "Très bon smartphone, seul bémol quelques applications préinstallées qu'on peut heureusement désinstaller."
                )
            ),
            aiSummary = AiReviewSummary(
                sentimentScore = 92,
                totalReviewsAnalyzed = 2100,
                summaryAr = "يمثل الهاتف الخيار المفضل للأغلبية بسبب سرعة الشحن الأسطورية 120 واط، الشاشة الجميلة المنحنية، والتخزين الضخم 512GB، مع جودة تصنيع فاخرة ضد الماء.",
                summaryEn = "Ranked by over 92% of buyers as the best bang-for-the-buck device thanks to 120W instant charging, 512GB storage, and rare IP68 water resistance under $350.",
                summaryFr = "Classé par 92% des utilisateurs comme le meilleur rapport équipement/prix grâce à la charge 120W et 512Go de stockage.",
                prosAr = listOf("شحن خارق 120W مرفق بالشاحن في العلبة", "سعة تخزين عملاقة 512GB مع 12GB RAM", "مقاومة الماء والغبار IP68 نادرة في هذه الفئة", "شاشة AMOLED بدقة 1.5K ساطعة وألوان مبهرة"),
                prosEn = listOf("Blazing 120W charger included in the box", "Huge 512GB storage + 12GB RAM", "Rare IP68 water rating at this price point", "Gorgeous 1.5K curved AMOLED display"),
                prosFr = listOf("Chargeur 120W ultra rapide inclus dans la boîte", "Stockage énorme de 512Go", "Étanchéité IP68 certifiée", "Superbe écran AMOLED 1,5K 120Hz"),
                consAr = listOf("الكاميرا الواسعة (Ultrawide) 8MP متوسطة الأداء في الإضاءة الخافتة", "واجهة HyperOS تحتوي على بعض الإعلانات الافتراضية"),
                consEn = listOf("Ultrawide 8MP sensor is average in low light", "HyperOS has some default bloatware to disable"),
                consFr = listOf("Capteur ultra grand-angle moyen en basse lumière", "Quelques applications superflues à désinstaller"),
                verdictAr = "أفضل صفقة شراء في الفئة السعرية الاقتصادية والمتوسطة بلا منازع.",
                verdictEn = "Best overall purchase in the budget-to-mid range category without contest.",
                verdictFr = "La meilleure affaire du marché dans sa tranche de prix sans hésitation."
            ),
            rating = 4.7f,
            reviewsCount = 2100,
            isRealDiscount = true,
            dealTag = "تخفيض -19% مؤكد"
        ),

        // 3. Apple MacBook Air M3 (Laptop)
        Product(
            id = "macbook-air-m3",
            name = "Apple MacBook Air 13\" (Puce M3)",
            brand = "Apple",
            category = ProductCategory.LAPTOPS,
            imageUrl = "https://images.unsplash.com/photo-1517336714731-489689fd1ca8?w=500&q=80",
            specTags = listOf(SpecTag.LIGHTWEIGHT, SpecTag.BATTERY, SpecTag.PERFORMANCE, SpecTag.VALUE),
            specsAr = mapOf(
                "المعالج" to "شريحة Apple M3 بـ 8 أنوية CPU و 10 أنوية GPU",
                "البطارية" to "حتى 18 ساعة عمل متواصل بشحنة واحدة حقيقية",
                "الوزن والسمك" to "1.24 كغ فقط، سمك فائق النحافة 11.3 ملم بدون مروحة صامت تماماً",
                "الشاشة" to "13.6 بوصة Liquid Retina بدقة 2560x1664 مع مليار لون",
                "الذاكرة والتخزين" to "16 جيجابايت موحدة + 512 جيجابايت SSD فائق السرعة"
            ),
            specsEn = mapOf(
                "Chip" to "Apple M3 chip (8-core CPU, 10-core GPU, 16-core Neural Engine)",
                "Battery" to "Up to 18 hours of real-world battery endurance",
                "Weight & Portability" to "Only 1.24 kg, fanless whisper-quiet design (11.3mm thin)",
                "Display" to "13.6-inch Liquid Retina (2560x1664) with 500 nits brightness",
                "Memory & Storage" to "16GB Unified Memory + 512GB Fast SSD"
            ),
            specsFr = mapOf(
                "Processeur" to "Puce Apple M3 (CPU 8 cœurs, GPU 10 cœurs)",
                "Autonomie" to "Jusqu'à 18 heures d'autonomie réelle",
                "Poids" to "Seulement 1,24 kg, conception silencieuse sans ventilateur",
                "Écran" to "13,6\" Liquid Retina 500 nits antireflet",
                "Mémoire" to "16 Go mémoire unifiée + 512 Go SSD"
            ),
            descriptionAr = "الحاسوب المحمول المثالي للطلبة والمبرمجين وصناع المحتوى: بطارية تدوم يوماً ونصف، وزن خفيف جداً، وأداء M3 السريع والصامت.",
            descriptionEn = "The ultimate ultrabook for students, developers, and creators: whisper-quiet fanless design, day-and-a-half battery life, and powerful M3 silicon.",
            descriptionFr = "L'ordinateur portable de référence : autonomie record, silence absolu sans ventilateur et puissance de la puce M3.",
            offers = listOf(
                StoreOffer("Amazon", "Authorized Apple Seller", 1199.0, 1399.0, true, "In Stock Prime", 4.9f, true, true, "https://amazon.com"),
                StoreOffer("Best Buy", "US Retailer", 1249.0, 1399.0, true, "In Stock Today", 4.8f, true, false, "https://bestbuy.com"),
                StoreOffer("Fnac", "Official Retailer", 1289.0, 1429.0, true, "Retrait en magasin 1h", 4.8f, true, false, "https://fnac.com"),
                StoreOffer("Ouedkniss (MacStore DZ)", "Algeria Local Store", 1260.0, 1450.0, true, "جديد في العلبة بضمان دولي", 4.7f, true, false, "https://ouedkniss.com")
            ),
            reviews = listOf(
                Review(
                    id = "rev-5",
                    userName = "Dr. Hichem B. (سطيف)",
                    rating = 5.0f,
                    date = "2026-02-10",
                    isVerifiedBuyer = true,
                    usagePeriod = "3 months",
                    commentAr = "أعمل به في الجامعة والبرمجة. لا أحمل معي الشاحن أبداً، أخرج به بنسبة 100% وأعود للمنزل وما زال فيه 40%! لوحة المفاتيح والماوس تاتش باد لا مثيل لهما.",
                    commentEn = "Using it for university and software development. I never bring the charger with me, battery holds up all day with 40% left at night. Unmatched trackpad.",
                    commentFr = "Parfait pour le travail et la programmation. Je ne prends jamais le chargeur en déplacement. Trackpad et clavier inégalés."
                )
            ),
            aiSummary = AiReviewSummary(
                sentimentScore = 97,
                totalReviewsAnalyzed = 1850,
                summaryAr = "حصل الجهاز على أعلى تقييم بنسبة رضا 97% بفضل بطاريته الاستثنائية التي تدوم طوال اليوم دون الحاجة للشاحن، وصمته الكامل بدون مراوح وتصميمه النحيف الفاخر.",
                summaryEn = "Earned an outstanding 97% satisfaction score centered around its unbeatable all-day battery life, completely silent fanless operation, and featherlight build.",
                summaryFr = "Score exceptionnel de 97% grâce à son autonomie record, son fonctionnement 100% silencieux sans ventilateur et sa légèreté.",
                prosAr = listOf("بطارية أسطورية تكفي يومين عمل دون شاحن", "هادئ تماماً بدون مراوح ولا يسخن في الاستخدام المكتبي", "لوحة لمس Trackpad الأفضل في عالم الحواسيب", "شاشة نقية ومكبرات صوت ممتازة"),
                prosEn = listOf("Legendary battery life (16-18h real use)", "Completely fanless and silent operation", "Best-in-class haptic trackpad", "Crisp Retina display and spatial audio speakers"),
                prosFr = listOf("Autonomie record de 16 à 18h réelles", "Silence absolu, aucune nuisance sonore", "Le meilleur trackpad du marché", "Écran très lumineux et haut-parleurs immersifs"),
                consAr = listOf("منافذ التوصيل محدودة بـ 2 منافذ Thunderbolt فقط", "الترقية الداخلية مستحيلة بعد الشراء"),
                consEn = listOf("Limited to two Thunderbolt USB-C ports", "RAM and SSD non-upgradable after purchase"),
                consFr = listOf("Seulement 2 ports USB-C Thunderbolt", "Mémoire et stockage soudés non évolutifs"),
                verdictAr = "أفضل حاسوب محمول خفيف للدراسة والعمل والتنقل، استثمار ممتاز طويل الأمد.",
                verdictEn = "The best everyday laptop for mobility, students, and professionals.",
                verdictFr = "Le meilleur ordinateur ultraportable pour la bureautique, les études et la mobilité."
            ),
            rating = 4.9f,
            reviewsCount = 1850,
            isRealDiscount = true,
            dealTag = "تخفيض -200$"
        ),

        // 4. Lenovo Legion Pro 5 Gen 9 (Gaming & Performance Laptop)
        Product(
            id = "lenovo-legion-pro-5",
            name = "Lenovo Legion Pro 5 Gen 9 (RTX 4070)",
            brand = "Lenovo",
            category = ProductCategory.LAPTOPS,
            imageUrl = "https://images.unsplash.com/photo-1603302576837-37561b2e2302?w=500&q=80",
            specTags = listOf(SpecTag.PERFORMANCE, SpecTag.STORAGE, SpecTag.OLED),
            specsAr = mapOf(
                "المعالج" to "AMD Ryzen 7 7745HX (8 أنوية / 16 مسار حتى 5.1 GHz)",
                "كرت الشاشة" to "NVIDIA GeForce RTX 4070 بذاكرة 8GB GDDR6 (TGP 140W)",
                "الشاشة" to "16 بوصة WQXGA (2560x1600) تردد 240Hz مع G-Sync",
                "الذاكرة والتخزين" to "32 جيجابايت DDR5 + 1 تيرابايت NVMe PCIe 4.0 SSD",
                "التبريد" to "نظام تبريد Legion Coldfront 5.0 بغرفة بخار مزدوجة"
            ),
            specsEn = mapOf(
                "Processor" to "AMD Ryzen 7 7745HX (8 cores / 16 threads up to 5.1 GHz)",
                "Graphics" to "NVIDIA GeForce RTX 4070 8GB GDDR6 (Full 140W TGP)",
                "Display" to "16-inch WQXGA (2560x1600) 240Hz 500 nits G-Sync",
                "RAM & Storage" to "32GB DDR5 + 1TB Fast NVMe SSD",
                "Cooling" to "Legion Coldfront 5.0 dual-fan vapor chamber system"
            ),
            specsFr = mapOf(
                "Processeur" to "AMD Ryzen 7 7745HX (8 cœurs, jusqu'à 5,1 GHz)",
                "Carte graphique" to "NVIDIA GeForce RTX 4070 8 Go (140W TGP max)",
                "Écran" to "16\" 2560x1600 240Hz 500 nits G-Sync ultra fluide",
                "Mémoire & Stockage" to "32 Go DDR5 + 1 To SSD NVMe",
                "Refroidissement" to "Système Legion Coldfront 5.0 à double chambre à vapeur"
            ),
            descriptionAr = "وحش الألعاب والمونتاج 3D: كرت RTX 4070 بكامل طاقته 140 واط، شاشة 240Hz مذهلة ونظام تبريد جبار.",
            descriptionEn = "High-performance powerhouse for gaming and 3D rendering: full 140W RTX 4070, crisp 240Hz screen, and elite thermal design.",
            descriptionFr = "PC portable gamer surpuissant : RTX 4070 à pleine puissance 140W, écran 240Hz ultra réactif et excellent refroidissement.",
            offers = listOf(
                StoreOffer("Amazon", "Global Gaming", 1399.0, 1699.0, true, "In Stock", 4.8f, true, true, "https://amazon.com"),
                StoreOffer("Ouedkniss (PC Gamer DZ)", "Algeria Local Store", 1450.0, 1750.0, true, "متوفر مع كفالة سنة كاملة", 4.9f, true, false, "https://ouedkniss.com"),
                StoreOffer("Best Buy", "US Retailer", 1429.0, 1699.0, true, "Fast delivery", 4.7f, true, false, "https://bestbuy.com"),
                StoreOffer("Darty", "France Retailer", 1520.0, 1799.0, true, "En stock magasin", 4.6f, true, false, "https://darty.com")
            ),
            reviews = listOf(
                Review(
                    id = "rev-6",
                    userName = "Mustapha K. (عنابة)",
                    rating = 5.0f,
                    date = "2026-02-18",
                    isVerifiedBuyer = true,
                    usagePeriod = "2 months",
                    commentAr = "يشغل جميع ألعاب 2025/2026 على أعلى إعدادات Ultra فوق 100 إطار بالثانية. التبريد ممتاز ولوحة المفاتيح مريحة جداً.",
                    commentEn = "Runs all modern AAA games on Ultra settings smoothly over 100 FPS. Cooling is superb and keyboard is top tier.",
                    commentFr = "Fait tourner tous les jeux récents en Ultra à plus de 100 FPS sans broncher. Le refroidissement est excellent."
                )
            ),
            aiSummary = AiReviewSummary(
                sentimentScore = 93,
                totalReviewsAnalyzed = 980,
                summaryAr = "حصد إعجاب اللاعبين والمصممين بفضل استقرار الأداء دون اختناق حراري، وشاشة 240Hz الرائعة، مع الإشارة إلى حجم الشاحن الكبير.",
                summaryEn = "Acclaimed by 93% of gamers and content creators for stable sustained frame rates, quiet cooling under load, and a gorgeous 240Hz 500-nit screen.",
                summaryFr = "Approuvé par 93% des joueurs pour sa puissance sans surchauffe et son écran 240Hz très lumineux.",
                prosAr = listOf("كرت شاشة RTX 4070 بأقصى استهلاك 140W", "شاشة مذهلة 240Hz بدقة 2K وسطوع 500 nits", "تبريد ممتاز يحافظ على درجات حرارة منخفضة", "إمكانية ترقية الرام والتخزين بسهولة"),
                prosEn = listOf("Full 140W TGP GPU performance", "Smooth 240Hz 2K 500-nit display", "Outstanding thermal management", "Easily upgradable dual RAM and M.2 SSD slots"),
                prosFr = listOf("RTX 4070 à pleine puissance 140W", "Écran 2K 240Hz 500 nits magnifique", "Refroidissement très efficace", "Évolutivité facile de la RAM et du SSD"),
                consAr = listOf("الشاحن كبير وثقيل الحجم (300 واط)", "البطارية تنفد في ساعتين إلى 3 ساعات عند الاستخدام الثقيل"),
                consEn = listOf("Heavy 300W power brick", "Battery life lasts around 3 hours under heavy workload"),
                consFr = listOf("Bloc d'alimentation 300W volumineux", "Autonomie limitée à 3h en usage soutenu"),
                verdictAr = "أفضل خيار لمن يبحث عن لابتوب ألعاب ومونتاج قوي بسعر مدروس يدوم لسنوات.",
                verdictEn = "Top recommendation for competitive gamers and creative editors needing maximum power per dollar.",
                verdictFr = "Le meilleur choix rapport puissance/prix pour les jeux et la création 3D."
            ),
            rating = 4.8f,
            reviewsCount = 980,
            isRealDiscount = true,
            dealTag = "خصم حقيقي -300$"
        ),

        // 5. Sony WH-1000XM5 (Audio & Noise Cancelling)
        Product(
            id = "sony-wh1000xm5",
            name = "Sony WH-1000XM5 (Casque Sans Fil)",
            brand = "Sony",
            category = ProductCategory.AUDIO,
            imageUrl = "https://images.unsplash.com/photo-1546435770-a3e426bf472b?w=500&q=80",
            specTags = listOf(SpecTag.BATTERY, SpecTag.LIGHTWEIGHT, SpecTag.PERFORMANCE, SpecTag.VALUE),
            specsAr = mapOf(
                "عزل الضوضاء (ANC)" to "معالجان مخصصان V1 و QN1 مع 8 ميكروفونات لعزل تام",
                "البطارية" to "30 ساعة تشغيل مع عزل الضجيج (شحن 3 دقائق يعطيك 3 ساعات)",
                "جودة الصوت" to "دعم ترميز LDAC عالي الدقة Hi-Res Audio وميزة DSEE Extreme",
                "الراحة" to "تصميم خفيف بجلد ناعم مريح لارتداء لساعات طويلة دون إرهاق",
                "الاتصال" to "توصيل بجهازين في نفس الوقت (Multipoint) مع ميزة التحدث التلقائي"
            ),
            specsEn = mapOf(
                "Noise Cancelling" to "Dual Processors (V1 + QN1) with 8 microphones for class-leading ANC",
                "Battery Life" to "30 hours with ANC enabled (3 min charge gives 3 hours)",
                "Audio Quality" to "Hi-Res Audio Wireless with LDAC and DSEE Extreme upscaling",
                "Comfort" to "Ultra-lightweight synthetic soft-fit leather headband",
                "Connectivity" to "Bluetooth Multipoint pairing to 2 devices simultaneously"
            ),
            specsFr = mapOf(
                "Réduction de bruit" to "Double processeur V1 et QN1 avec 8 micros pour un silence total",
                "Autonomie" to "30 heures avec ANC activé (3 min de charge = 3 heures d'écoute)",
                "Qualité audio" to "Hi-Res Audio sans fil avec codec LDAC et spatialisation",
                "Confort" to "Conception ultra légère et cuir souple sans pression",
                "Connexion" to "Multipoint Bluetooth pour relier simultanément smartphone et PC"
            ),
            descriptionAr = "المعيار الذهبي لسماعات الرأس في العالم: عزل ضوضاء أسطوري في الطائرة والشارع والمكتب مع بطارية تدوم 30 ساعة.",
            descriptionEn = "The world benchmark for wireless headphones: market-leading noise cancellation, 30-hour battery, and lush Hi-Res sound.",
            descriptionFr = "La référence mondiale du casque audio : réduction de bruit active exceptionnelle et 30h d'autonomie.",
            offers = listOf(
                StoreOffer("Amazon", "Global Verified", 328.0, 399.0, true, "In Stock Prime", 4.9f, true, true, "https://amazon.com"),
                StoreOffer("Fnac", "Official Retailer", 349.0, 419.0, true, "En stock magasin", 4.8f, true, false, "https://fnac.com"),
                StoreOffer("Ouedkniss (Audio DZ)", "Algeria Local Store", 345.0, 410.0, true, "أصلي 100% متوفر بالجزائر", 4.8f, true, false, "https://ouedkniss.com"),
                StoreOffer("Best Buy", "US Retailer", 349.0, 399.0, true, "Free shipping", 4.7f, true, false, "https://bestbuy.com")
            ),
            reviews = listOf(
                Review(
                    id = "rev-7",
                    userName = "Nadir S. (البليدة)",
                    rating = 5.0f,
                    date = "2026-02-12",
                    isVerifiedBuyer = true,
                    usagePeriod = "7 months",
                    commentAr = "عندما أضعها وأشغل العزل الصوتي يختفي كل ضجيج الشارع وحركة المرور تماماً! بطاريتها تكفيني أسبوعاً كاملاً دون شحن وصوت المكالمات واضح جداً.",
                    commentEn = "When you turn on the noise cancellation, the city noise disappears into pure silence. Battery lasts a whole week of work.",
                    commentFr = "Dès qu'on active la réduction de bruit, le monde extérieur s'éteint. Autonomie d'une semaine complète de travail."
                )
            ),
            aiSummary = AiReviewSummary(
                sentimentScore = 96,
                totalReviewsAnalyzed = 3400,
                summaryAr = "تعد السماعة الأفضل تقييماً عالمياً في فئة عزل الضوضاء وجودة المكالمات والراحة الفائقة، مع ملاحظة أنها لا تنطوي بالكامل مثل الإصدار السابق.",
                summaryEn = "Rated as the best noise-cancelling headphones on the planet by 96% of buyers, praising its silence cocoon, 30h battery, and crystal-clear microphone calls.",
                summaryFr = "Plébiscité par 96% des acheteurs comme le meilleur casque à réduction de bruit active au monde avec un confort exemplaire.",
                prosAr = listOf("أقوى وأدق عزل ضوضاء في السوق بلا منازع", "راحة فائقة على الرأس لساعات طويلة", "بطارية تدوم 30 ساعة مع شحن سريع جداً", "ميكروفونات مكالمات نقية تعزل الرياح"),
                prosEn = listOf("Best-in-class active noise cancellation", "Ultra-comfortable featherweight fit", "30-hour battery with rapid quick charge", "Studio-quality beamforming mic for calls"),
                prosFr = listOf("Meilleure réduction de bruit active du marché", "Confort remarquable sans pression sur le crâne", "Autonomie de 30 heures réelles", "Excellente clarté d'appel en milieu bruyant"),
                consAr = listOf("لا تنطوي السماعة لداخل الطوق مثل XM4 وتأتي بحافظة أكبر", "غير مقاومة للماء للرياضات العنيفة"),
                consEn = listOf("Headband does not fold compactly like previous XM4", "Not waterproof for intense workouts"),
                consFr = listOf("Le casque ne se replie pas sur lui-même comme le XM4", "Non étanche pour le sport intensif"),
                verdictAr = "أفضل استثمار للتركيز والدراسة والسفر والاستمتاع بالموسيقى بنقاء استثنائي.",
                verdictEn = "Essential purchase for frequent travelers, office workers, and audiophiles.",
                verdictFr = "L'investissement idéal pour travailler au calme, voyager et écouter de la musique."
            ),
            rating = 4.8f,
            reviewsCount = 3400,
            isRealDiscount = true,
            dealTag = "تخفيض -18%"
        ),

        // 6. Samsung Galaxy Watch 6 Classic (Smartwatch)
        Product(
            id = "galaxy-watch-6-classic",
            name = "Samsung Galaxy Watch 6 Classic (47mm)",
            brand = "Samsung",
            category = ProductCategory.WATCHES,
            imageUrl = "https://images.unsplash.com/photo-1579586337278-3befd40fd17a?w=500&q=80",
            specTags = listOf(SpecTag.OLED, SpecTag.VALUE, SpecTag.LIGHTWEIGHT),
            specsAr = mapOf(
                "الإطار والشاشة" to "إطار دوار فيزيائي كلاسيكي مع شاشة Super AMOLED من الكريستال الياقوتي (Sapphire)",
                "مستشعرات الصحة" to "تخطيط القلب ECG، قياس ضغط الدم، نسبة الدهون والعضلات BIA، وتتبع دقيق للنوم",
                "النظام والتطبيقات" to "Wear OS بنظام Google يدعم خرائط Google، وتطبيقات WhatsApp و Spotify",
                "المتانة" to "مقاومة ماء حتى عمق 50 متراً 5ATM وشهادة عسكرية MIL-STD-810H"
            ),
            specsEn = mapOf(
                "Display & Bezel" to "Iconic physical rotating bezel with Sapphire Crystal Super AMOLED display",
                "Health Sensors" to "ECG, Blood Pressure monitoring, BIA body composition, and Sleep Coach",
                "OS & Ecosystem" to "Wear OS powered by Google (Google Maps, WhatsApp, Spotify, Google Wallet)",
                "Durability" to "5ATM water resistance + IP68 + Military grade MIL-STD-810H"
            ),
            specsFr = mapOf(
                "Cadran & Écran" to "Lunette rotative physique rotative avec verre en cristal de saphir inrayable",
                "Santé" to "Électrocardiogramme ECG, tension artérielle, composition corporelle BIA et sommeil",
                "Système" to "Wear OS avec Google Maps, WhatsApp, Spotify et paiements sans contact",
                "Robustesse" to "Étanche 5ATM (50m) et norme militaire de résistance MIL-STD-810H"
            ),
            descriptionAr = "الساعة الذكية الأجمل والأكثر عملية: إطار دوار فيزيائي ممتع للتحكم، قياس دقيق للمؤشرات الصحية وتصميم كلاسيكي فاخر.",
            descriptionEn = "The most versatile smartwatch for Android: rotating physical bezel, medical-grade health insights, and timeless premium stainless steel.",
            descriptionFr = "La montre connectée la plus élégante sous Android : lunette rotative mécanique, suivi santé complet et finitions acier.",
            offers = listOf(
                StoreOffer("Amazon", "Global Seller", 249.0, 399.0, true, "In Stock", 4.7f, true, true, "https://amazon.com"),
                StoreOffer("Ouedkniss (Smart DZ)", "Algeria Local Store", 265.0, 380.0, true, "متوفر تسليم فوري بالجزائر", 4.8f, true, false, "https://ouedkniss.com"),
                StoreOffer("Best Buy", "US Retailer", 279.0, 399.0, true, "In Stock", 4.6f, true, false, "https://bestbuy.com"),
                StoreOffer("Fnac", "Official Retailer", 289.0, 419.0, true, "En stock", 4.7f, true, false, "https://fnac.com")
            ),
            reviews = listOf(
                Review(
                    id = "rev-8",
                    userName = "Walid M. (قسنطينة)",
                    rating = 5.0f,
                    date = "2026-02-05",
                    isVerifiedBuyer = true,
                    usagePeriod = "5 months",
                    commentAr = "الإطار الدوار رائع جداً ولا يمكنني الاستغناء عنه. الساعة تبدو كأنها ساعة سويسرية كلاسيكية فخمة وتستقبل المكالمات والرسائل بوضوح.",
                    commentEn = "The rotating bezel is genius. Looks like a luxury classic watch and handles calls and WhatsApp seamlessly.",
                    commentFr = "La bague rotative est un pur plaisir au quotidien. Elle ressemble à une vraie montre de luxe tout en étant ultra connectée."
                )
            ),
            aiSummary = AiReviewSummary(
                sentimentScore = 91,
                totalReviewsAnalyzed = 1620,
                summaryAr = "أشاد المشترون بالإطار الدوار الميكانيكي العملي، ودقة قياسات النوم وتخطيط القلب، والشاشة الياقوتية المضادة للخدش تماماً، مع ضرورة شحنها كل يوم ونصف.",
                summaryEn = "Over 91% of buyers celebrate the satisfying physical rotating bezel, scratch-proof sapphire crystal, and comprehensive health sensors. Battery life is typically 36 hours.",
                summaryFr = "91% d'avis positifs pour la lunette rotative ultra intuitive, le verre saphir inrayable et les capteurs de santé complets.",
                prosAr = listOf("إطار دوار فيزيائي فريد وممتع في الاستخدام", "شاشة كريستال ياقوتي مضادة للخدش تماماً", "تخطيط قلب ECG وتتبع متطور لمراحل النوم", "نظام Wear OS الغني بتطبيقات جوجل الكاملة"),
                prosEn = listOf("Tactile physical rotating bezel navigation", "Scratch-resistant Sapphire crystal glass", "Full ECG and body composition sensors", "Rich Wear OS app ecosystem (Google Maps/WhatsApp)"),
                prosFr = listOf("Bague rotative mécanique très agréable", "Verre saphir haute résistance aux rayures", "Suivi ECG et composition corporelle", "Écosystème d'applications Wear OS très complet"),
                consAr = listOf("عمر البطارية يتراوح بين يوم إلى يوم ونصف ويحتاج شحناً منتظماً", "بعض ميزات ضغط الدم تتطلب هاتف سامسونج"),
                consEn = listOf("Battery lasts 1 to 1.5 days requiring daily top-up", "Blood pressure feature requires Samsung phone"),
                consFr = listOf("Autonomie de 36 heures nécessitant une charge quotidienne", "Tension artérielle réservée aux smartphones Samsung"),
                verdictAr = "أفضل ساعة ذكية بنظام أندرويد تجمع بين الأناقة الكلاسيكية والتكنولوجيا المتقدمة.",
                verdictEn = "The premier Android smartwatch combining timeless horology design with modern fitness smarts.",
                verdictFr = "La meilleure montre connectée Android alliant look horloger traditionnel et haute technologie."
            ),
            rating = 4.7f,
            reviewsCount = 1620,
            isRealDiscount = true,
            dealTag = "عرض مذهل -37%"
        ),

        // 7. Apple iPad Air 11" (M2) (Tablet)
        Product(
            id = "ipad-air-m2",
            name = "Apple iPad Air 11\" (Puce M2)",
            brand = "Apple",
            category = ProductCategory.TABLETS,
            imageUrl = "https://images.unsplash.com/photo-1544244015-0df4b3ffc6b0?w=500&q=80",
            specTags = listOf(SpecTag.PERFORMANCE, SpecTag.LIGHTWEIGHT, SpecTag.STORAGE, SpecTag.BATTERY),
            specsAr = mapOf(
                "المعالج" to "شريحة Apple M2 الخارقة للألعاب والتصميم",
                "الشاشة" to "11 بوصة Liquid Retina مع ألوان واسعة P3 وتقنية True Tone",
                "الملحقات" to "دعم قلم Apple Pencil Pro الجديد ولوحة مفاتيح Magic Keyboard",
                "البطارية" to "10 ساعات استخدام متواصل للوسائط والعمل",
                "التخزين" to "128 جيجابايت أساسية (ضعف الجيل السابق)"
            ),
            specsEn = mapOf(
                "Processor" to "Apple M2 chip with 8-core CPU and 10-core GPU",
                "Display" to "11-inch Liquid Retina with P3 wide color and True Tone",
                "Accessories" to "Full support for Apple Pencil Pro and Magic Keyboard",
                "Battery" to "Up to 10 hours of active web and multimedia use",
                "Storage" to "128GB baseline storage (doubled from previous gen)"
            ),
            specsFr = mapOf(
                "Processeur" to "Puce Apple M2 surpuissante (CPU 8 cœurs, GPU 10 cœurs)",
                "Écran" to "11\" Liquid Retina avec gamme de couleurs P3 et True Tone",
                "Accessoires" to "Compatible Apple Pencil Pro et Magic Keyboard",
                "Batterie" to "10 heures d'autonomie en navigation et vidéo",
                "Stockage" to "128 Go en modèle de base"
            ),
            descriptionAr = "الجهاز اللوحي المتكامل للدراسة والرسم والمونتاج: قوة شريحة M2 مع دعم الجيل الجديد من Apple Pencil Pro وتصميم نحيف جداً.",
            descriptionEn = "The gold standard tablet for studying, digital art, and video editing: M2 silicon speed, Apple Pencil Pro support, and paper-thin design.",
            descriptionFr = "La tablette idéale pour les études, le dessin et le multimédia : puissance M2 et prise en charge de l'Apple Pencil Pro.",
            offers = listOf(
                StoreOffer("Amazon", "Global Retailer", 549.0, 599.0, true, "In Stock", 4.9f, true, true, "https://amazon.com"),
                StoreOffer("Fnac", "Official Retailer", 569.0, 629.0, true, "En stock magasin", 4.8f, true, false, "https://fnac.com"),
                StoreOffer("Ouedkniss (Apple Store DZ)", "Algeria Local Store", 575.0, 650.0, true, "جديد مغلف في العلبة", 4.7f, true, false, "https://ouedkniss.com"),
                StoreOffer("Best Buy", "US Retailer", 559.0, 599.0, true, "Ships in 24h", 4.8f, true, false, "https://bestbuy.com")
            ),
            reviews = listOf(
                Review(
                    id = "rev-9",
                    userName = "Rania K. (تيزي وزو)",
                    rating = 5.0f,
                    date = "2026-02-14",
                    isVerifiedBuyer = true,
                    usagePeriod = "3 months",
                    commentAr = "أستخدمه كطالبة طب لتسجيل المحاضرات مع Apple Pencil Pro. استجابة القلم وسرعة فتح ملفات الـ PDF الكبيرة مذهلة جداً والبطارية تصمد طوال اليوم في الكلية.",
                    commentEn = "Using it as a medical student for lecture notes with Pencil Pro. Instant responsiveness with heavy textbooks and easily lasts the whole day.",
                    commentFr = "Utilisé pour mes études de médecine. Prise de note très fluide avec l'Apple Pencil Pro et autonomie parfaite pour la journée de cours."
                )
            ),
            aiSummary = AiReviewSummary(
                sentimentScore = 95,
                totalReviewsAnalyzed = 1450,
                summaryAr = "يعتبر الآيباد الأكثر توازناً وقيمة، مع معالج M2 فائق السرعة، وميزات Apple Pencil Pro المتقدمة للرسم والملاحظات، مع إشادة بزيادة السعة الأساسية إلى 128GB.",
                summaryEn = "Recommended by 95% of users as the sweet spot in Apple's tablet lineup: desktop-class M2 performance, 128GB base storage, and seamless Pencil Pro haptics.",
                summaryFr = "Recommandé par 95% des utilisateurs comme le meilleur compromis de la gamme iPad grâce à la puce M2 et 128Go de base.",
                prosAr = listOf("أداء جبار بفضل معالج Apple M2", "دعم ميزات القلم المتقدمة مثل الضغط والاهتزاز اللمسي", "سعة التخزين الأساسية أصبحت 128GB", "نحيف وخفيف وسهل الحمل في الحقيبة"),
                prosEn = listOf("Desktop-class M2 processor speed", "Apple Pencil Pro haptic squeeze support", "128GB doubled base storage", "Featherlight and thin aluminium chassis"),
                prosFr = listOf("Puissance phénoménale de la puce M2", "Support complet de l'Apple Pencil Pro", "128 Go de stockage dès l'entrée de gamme", "Design fin et très agréable à transporter"),
                consAr = listOf("الشاشة 60Hz وليست 120Hz ProMotion (مخصصة لفئة البرو فقط)", "الملحقات مثل القلم والكيبورد تباع منفصلة بسعر مرتفع"),
                consEn = listOf("Screen refresh rate is 60Hz rather than 120Hz ProMotion", "Pencil and Keyboard accessories sold separately"),
                consFr = listOf("Écran à 60Hz sans technologie 120Hz ProMotion", "Accessoires (stylet, clavier) vendus séparément à prix élevé"),
                verdictAr = "اللوحي الأفضل للشراء لمعظم المستخدمين والطلبة والمصممين.",
                verdictEn = "The best value Apple tablet for 90% of users, students, and digital creators.",
                verdictFr = "La meilleure tablette polyvalente pour les études, le travail et la création."
            ),
            rating = 4.8f,
            reviewsCount = 1450,
            isRealDiscount = true,
            dealTag = "خصم -50$"
        ),

        // 8. Anker Soundcore Space One (Budget Audio)
        Product(
            id = "anker-space-one",
            name = "Anker Soundcore Space One",
            brand = "Anker",
            category = ProductCategory.AUDIO,
            imageUrl = "https://images.unsplash.com/photo-1505740420928-5e560c06d30e?w=500&q=80",
            specTags = listOf(SpecTag.VALUE, SpecTag.BATTERY, SpecTag.LIGHTWEIGHT),
            specsAr = mapOf(
                "عزل الصوت" to "عزل ضوضاء متكيف نشط 2X يقلل الأصوات بنسبة تصل إلى 98%",
                "البطارية" to "40 ساعة مع تشغيل العزل الصوتي (55 ساعة بدونه!)",
                "الصوت" to "صوت عالي الدقة Hi-Res مع دعم ترميز LDAC اللاسلكي وتطبيق تحكم بمعادل صوتي",
                "السعر" to "قيمة اقتصادية خارقة لا تتجاوز 99 دولار"
            ),
            specsEn = mapOf(
                "ANC" to "2X stronger voice reduction adaptive active noise cancelling",
                "Battery" to "40 hours with ANC ON (up to 55 hours with ANC OFF)",
                "Audio" to "Hi-Res Wireless certified with LDAC codec support",
                "Price / Value" to "Incredible budget audio champion under $100"
            ),
            specsFr = mapOf(
                "Réduction de bruit" to "Réduction active adaptative réduisant jusqu'à 98% des bruits ambiants",
                "Autonomie" to "40 heures avec ANC (jusqu'à 55 heures sans ANC)",
                "Son" to "Certifié Hi-Res Audio sans fil avec codec LDAC et égaliseur complet",
                "Rapport Q/P" to "L'un des meilleurs casques économiques sous les 100€"
            ),
            descriptionAr = "البديل الاقتصادي الأذكى لسماعات سوني وأبل: عزل ضجيج ممتاز وبطارية خارقة 40 ساعة بأقل من 100 دولار.",
            descriptionEn = "The smartest budget alternative to flagship headphones: solid active noise cancellation and 40h battery for under $100.",
            descriptionFr = "L'alternative économique idéale : réduction de bruit convaincante et 40h d'autonomie pour moins de 100€.",
            offers = listOf(
                StoreOffer("Amazon", "Official Anker Store", 79.0, 99.0, true, "In Stock Prime", 4.8f, true, true, "https://amazon.com"),
                StoreOffer("Ouedkniss (Store Tech DZ)", "Algeria Local Store", 85.0, 110.0, true, "متوفر مع التوصيل بالجزائر", 4.7f, true, false, "https://ouedkniss.com"),
                StoreOffer("Jumia DZ", "Algeria Online", 88.0, 105.0, true, "توصيل للمنزل", 4.6f, false, false, "https://jumia.dz")
            ),
            reviews = listOf(
                Review(
                    id = "rev-10",
                    userName = "Farid L. (سطيف)",
                    rating = 5.0f,
                    date = "2026-02-08",
                    isVerifiedBuyer = true,
                    usagePeriod = "4 months",
                    commentAr = "اشتريتها لأن ميزانيتي محدودة ولا يمكنني شراء سوني. النتيجة أبهرتني! عزل الصوت ممتاز جداً والبطارية أنسى متى شحنتها آخر مرة.",
                    commentEn = "Bought it because I couldn't stretch to Sony. Blown away by how good the ANC is and battery literally lasts forever.",
                    commentFr = "Acheté car budget limité pour du Sony. Très impressionné par la réduction de bruit et la batterie inépuisable."
                )
            ),
            aiSummary = AiReviewSummary(
                sentimentScore = 93,
                totalReviewsAnalyzed = 2800,
                summaryAr = "حصدت السماعة إشادة جماعية كأفضل سماعة عزل ضوضاء تحت 100 دولار، مع بطارية ضخمة تدوم 40 ساعة وتطبيق متطور لمعايرة الصوت.",
                summaryEn = "Crowned by over 93% of reviewers as the unchallenged king of budget ANC headphones with 40-55 hour battery endurance.",
                summaryFr = "Reconnue par 93% des acheteurs comme le meilleur casque à réduction de bruit sous les 100€.",
                prosAr = listOf("سعر اقتصادي جداً في متناول الجميع", "بطارية تدوم من 40 إلى 55 ساعة بشحنة واحدة", "تطبيق Soundcore المميز لضبط وتخصيص الصوت", "خفيفة ومريحة على الأذنين"),
                prosEn = listOf("Unbeatable price under $100", "Massive 40-55 hour battery life", "Excellent Soundcore companion app with EQ", "Comfortable lightweight ear cups"),
                prosFr = listOf("Prix très accessible sous les 100€", "Autonomie colossale de 40 à 55 heures", "Application Soundcore avec égaliseur complet", "Très confortable et léger"),
                consAr = listOf("عزل الصوت أقل قوة في الطائرات مقارنة بسوني وسعرها 300$", "خامات البلاستيك أقل فخامة من الفئات العليا"),
                consEn = listOf("ANC is not quite at the flagship Sony XM5 level in airplane cabins", "Plastic build feels lighter than premium flagships"),
                consFr = listOf("Réduction de bruit légèrement en retrait par rapport aux casques à 300€", "Finitions en plastique simple"),
                verdictAr = "صفقة رابحة 100% لمن يريد عزل ضوضاء وبطارية طويلة بميزانية معقولة.",
                verdictEn = "A total no-brainer purchase for budget-conscious buyers wanting ANC.",
                verdictFr = "Le choix incontournable pour un excellent casque sans se ruiner."
            ),
            rating = 4.7f,
            reviewsCount = 2800,
            isRealDiscount = true,
            dealTag = "خصم -20% حقيقي"
        )
    )
}
