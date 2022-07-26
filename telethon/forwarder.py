from telethon import TelegramClient, events, types
from datetime import datetime
from zoneinfo import ZoneInfo
import re
import telethon
import asyncio
import pattern_check
import speak

api_id = 11533286
api_hash = '700884cea7115e8a4e682cf374b67faf'

self_id = 'me'  # 5429147455

all_slots_id = -1001371184682
mock_all_slots_id = 'Mock All Slots for Testing'    # -1001761172272
slot_info_filtered_id = 'Filtered slots'            # -1001574570498

telegram_id = 777000
padma_id = 5152033501
pb_id = 5564755971


def new_client() -> TelegramClient:
    return TelegramClient('admin', api_id, api_hash)

async def junk():
    client = new_client()
    message: types.Message = await client.send_message("entity")
    client.forward_messages
    message.forward_to()



async def run_forwarder(client: TelegramClient):
    source = [all_slots_id, mock_all_slots_id]
    target = slot_info_filtered_id

    message_mapping = {}

    # @client.on(events.MessageDeleted(chats=source))
    async def on_message_deleted(event):
        try:
            message: telethon.types.Message = event.message
            forwarded_message = message_mapping[message.id]
            if forwarded_message:
                forwarded_message.delete()
            else:
                print("forwarded message not found corresponding to deleted message: ", message.stringify())
        except Exception as err:
            print(err)
            print("deleted message: ")
            print(message.stringify())

    @client.on(events.NewMessage(chats=source))
    async def on_new_message(event):
        try:
            message: types.Message = event.message
            text = message.text
            if pattern_check.should_forward(text):
                message_sent_at = message.date
                now = datetime.now(ZoneInfo(key='America/New_York'))
                delay = now - message_sent_at
                now_str = datetime.now().strftime("%d/%m/%Y %H:%M:%S")
                print(now_str, delay, '|', text)
                if pattern_check.is_priority(text):
                    speak.shout()

            # message.forward_to()
            # forwarded_message = await client.forward_messages(target, message)
            # message_mapping[message.id] = forwarded_message
        except Exception as err:
            raise err

    await client.start()
    await client.run_until_disconnected()


async def say_hello_self(client):
    await client.send_message('me', 'Hello, myself!')


async def print_chat(client, id):
    async for message in client.iter_messages(id):
        print(message.id, message.text)


async def list_chats(client):
    # You can print all the dialogs/conversations that you are part of:
    async for dialog in client.iter_dialogs():
        print(dialog.name, 'has ID', dialog.id)

async def get_me(client):
    me = await client.get_me()
    print(me.stringify())

async def get_chats(client):
    # You can print all the dialogs/conversations that you are part of:
    async for dialog in client.iter_dialogs():
        print(dialog.name, ':', dialog.id)

async def run():
    client = new_client()

    fn = run_forwarder(client)

    async with client:
        await fn


if __name__ == "__main__":
    asyncio.run(run())

# client = TelegramClient('anon', api_id, api_hash)
# async def main():
#     # # You can send messages to yourself...
#     # await client.send_message('me', 'Hello, myself!')
#     # # ...to some chat ID
#     # await client.send_message(-100123456, 'Hello, group!')
#     # # ...to your contacts
#     # await client.send_message('+34600123123', 'Hello, friend!')
#     # # ...or even to any username
#     # await client.send_message('username', 'Testing Telethon!')

#     # # You can, of course, use markdown in your messages:
#     # message = await client.send_message(
#     #     'me',
#     #     'This message has **bold**, `code`, __italics__ and '
#     #     'a [nice website](https://example.com)!',
#     #     link_preview=False
#     # )

#     # # Sending a message returns the sent message object, which you can use
#     # print(message.raw_text)

#     # # You can reply to messages directly if you have a message object
#     # await message.reply('Cool!')

#     # # Or send files, songs, documents, albums...
#     # await client.send_file('me', '/home/me/Pictures/holidays.jpg')

#     # You can print the message history of any chat:
#     async for message in client.iter_messages(777000):
#         print(message.id, message.text)

#         # You can download media from messages, too!
#         # The method will return the path where the file was saved.
#         if message.photo:
#             print(message)
#             path = await message.download_media()
#             print('File saved to', path)  # printed after download is done

#         await message.forward_to('me')

#     client.message

# with client:
#     client.loop.run_until_complete(main())
