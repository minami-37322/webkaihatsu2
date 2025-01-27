// package com.example.demo2.controller;

// import jakarta.servlet.ServletContext;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;

// import java.util.ArrayList;
// import java.util.List;

// @Controller
// @RequestMapping("/each")
// public class ChatController {

//     private final ServletContext servletContext;

//     public ChatController(ServletContext servletContext) {
//         this.servletContext = servletContext;
//     }

//     @RequestMapping("")
//     public String index(Model model) {
//         // アプリケーションスコープからリストを取得
//         List<String> messages = (List<String>) servletContext.getAttribute("chatMessages");

//         // nullなら新規作成して格納
//         if (messages == null) {
//             messages = new ArrayList<>();
//             servletContext.setAttribute("chatMessages", messages);
//         }

//         // モデルに追加（ビューで利用可能にする）
//         model.addAttribute("messages", messages);

//         // チャットのホームページへフォワード
//         return "ex-16"; // chatHome.html へフォワード
//     }

//     @RequestMapping("/post")
//     public String post(@RequestParam("name") String name,
//                        @RequestParam("comment") String comment,
//                        Model model) {
//         // アプリケーションスコープからリストを取得
//         List<User> messages = (List<User>) servletContext.getAttribute("chatMessages");

//         // nullなら新規作成して格納
//         if (messages == null) {
//             messages = new ArrayList<>();
//             servletContext.setAttribute("chatMessages", messages);
//         }

//         // Userオブジェクト作成
//         User newUser = new User(name, comment);

//         // 先頭に追加（index 0 に add）
//         messages.add(0, newUser);

//         // 更新後のリストをモデルに追加
//         model.addAttribute("messages", messages);

//         // チャットページへフォワード
//         return "ex-16";
//     }
// }

//chatGPTに全部聞いたけど動かないし全くわからん。一旦前の単元に戻る。ほかのコントローラーにエラーが起きるから一回全部コメントアウト



